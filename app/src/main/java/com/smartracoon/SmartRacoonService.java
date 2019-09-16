package com.smartracoon;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

import net.osmand.aidl.navigation.ADirectionInfo;
import net.osmand.aidl.navigation.OnVoiceNavigationParams;

import java.util.List;

public class SmartRacoonService extends Service {
    private static final int REQUEST_CODE = 6333; // onActivityResult request
    public static final String inputExtra = "inputExtra";
    public static final String inputGPX = "inputGPX";
    public static final String ACTION_START_FOREGROUND_SERVICE = "ACTION_START_FOREGROUND_SERVICE";
    public static final String ACTION_STOP_FOREGROUND_SERVICE = "ACTION_STOP_FOREGROUND_SERVICE";
    public static final String ACTION_GPX_SERVICE = "GPX_SERVICE";
    private OsmAndHelper mOsmAndHelper;
    private OsmAndAidlHelper mOsmAndAidlHelper;
    private OsmAndHelper.OnOsmandMissingListener mOnOsmandMissingListener;
    private long callback = 3423;
    private int nofifyid = 3412;
    private Bitmap mbm;
    private String mdir;
    private int mdistance = 0;

    @Override
    public void onCreate() {
        mOnOsmandMissingListener = new OsmAndHelper.OnOsmandMissingListener() {

            @Override
            public void osmandMissing() {

            }
        };
        mbm = BitmapFactory.decodeResource(getResources(), R.drawable.ic_racoon);

        mOsmAndAidlHelper = new OsmAndAidlHelper(this, mOnOsmandMissingListener);
        mOsmAndHelper = new OsmAndHelper(this, REQUEST_CODE, mOnOsmandMissingListener);
        mOsmAndAidlHelper.setVoiceRouterNotifyListener(new OsmAndAidlHelper.VoiceRouterNotifyListener() {

            @Override
            public void onVoiceRouterNotify(OnVoiceNavigationParams params) {
                List<String> cmds = params.getPlayed();


                if (cmds.size() > 0) {
                    mdir = "";
                    for (String s : cmds) {
                        mdir = mdir + " " + s;
                    }

                }
                if (mdistance > 0) {
                    String dir = "Distance " + mdistance + " m " + mdir;
                    Intent notificationIntent = new Intent(SmartRacoonService.this, MainActivity.class);
                    PendingIntent pendingIntent = PendingIntent.getActivity(SmartRacoonService.this,
                            0, notificationIntent, 0);


                    Notification notification = new NotificationCompat.Builder(SmartRacoonService.this, SmartRacoonApp.CHANNEL_ID)

                            .setVisibility(Notification.VISIBILITY_PUBLIC)
                            .setPriority(NotificationCompat.PRIORITY_MAX)

                            // .setContentTitle("Direction")
                            .setContentTitle(dir)
                            .setLargeIcon(mbm)
                            .setSmallIcon(R.drawable.ic_racoon)
                            .setContentIntent(pendingIntent)
                            .build();
                    startForeground(nofifyid, notification);
                }

            }
        });
        mOsmAndAidlHelper.setNavigationInfoUpdateListener(new OsmAndAidlHelper.NavigationInfoUpdateListener() {

            @Override
            public void onNavigationInfoUpdate(ADirectionInfo directionInfo) {
                mdistance = directionInfo.getDistanceTo();
            }
        });

        //mOsmAndHelper.muteNavigation();
        Toast.makeText(getApplicationContext(), "osmand Connected!", Toast.LENGTH_SHORT).show();

        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,
                0, notificationIntent, 0);
        if (intent != null) {
            String action = intent.getAction();
            Notification notification;
            switch (action) {
                case ACTION_START_FOREGROUND_SERVICE:
                    String input = intent.getStringExtra(inputExtra);
                    notification = new NotificationCompat.Builder(this, SmartRacoonApp.CHANNEL_ID)
                            .setVisibility(Notification.VISIBILITY_PUBLIC)
                            .setContentTitle("SmartRacoon")
                            .setSmallIcon(R.drawable.ic_racoon)
                            .setLargeIcon(mbm)
                            .setContentIntent(pendingIntent)
                            .build();

                    startForeground(nofifyid, notification);
                    Toast.makeText(getApplicationContext(), "Foreground service is started.", Toast.LENGTH_LONG).show();

                    break;
                case ACTION_STOP_FOREGROUND_SERVICE:
                    Toast.makeText(getApplicationContext(), "Foreground service is stopped.", Toast.LENGTH_LONG).show();
                    mOsmAndAidlHelper.stopNavigation();
                    break;
                case ACTION_GPX_SERVICE:
                    Uri uri = intent.getParcelableExtra(inputGPX);
                    notification = new NotificationCompat.Builder(this, SmartRacoonApp.CHANNEL_ID)
                            .setVisibility(Notification.VISIBILITY_PUBLIC)
                            .setContentTitle("SmartRacoon")
                            .setContentText(uri.getPath())
                            .setSmallIcon(R.drawable.ic_racoon)
                            //.setLargeIcon(mbm)
                            .setContentIntent(pendingIntent)
                            .build();

                    startForeground(nofifyid, notification);
                    //mOsmAndAidlHelper.navigateGpxFromUri(uri, true);
                    mOsmAndAidlHelper.registerForVoiceRouterMessages(true, callback);
                    mOsmAndAidlHelper.registerForNavigationUpdates(true, callback);
                    //mOsmAndHelper.muteNavigation();

                    mOsmAndHelper.navigateGpxUri(true, uri);


                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + action);
            }
        }

        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        Toast.makeText(getApplicationContext(), "Foreground service is stopped.", Toast.LENGTH_LONG).show();
        mOsmAndAidlHelper.stopNavigation();
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}