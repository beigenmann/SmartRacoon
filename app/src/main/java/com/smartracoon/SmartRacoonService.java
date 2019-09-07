package com.smartracoon;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

public class SmartRacoonService extends Service {
    public static final String inputExtra = "inputExtra";
    public static final String inputGPX = "inputGPX";
    public static final String ACTION_START_FOREGROUND_SERVICE = "ACTION_START_FOREGROUND_SERVICE";
    public static final String ACTION_STOP_FOREGROUND_SERVICE = "ACTION_STOP_FOREGROUND_SERVICE";
    public static final String ACTION_GPX_SERVICE = "GPX_SERVICE";

    private OsmAndAidlHelper mOsmAndAidlHelper;

    @Override
    public void onCreate() {

        mOsmAndAidlHelper = new OsmAndAidlHelper(this, new OsmAndHelper.OnOsmandMissingListener() {

            @Override
            public void osmandMissing() {
                Toast.makeText(getApplicationContext(), "osmand failed", Toast.LENGTH_SHORT).show();
            }
        });
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
                            .setContentTitle("SmartRacoon")
                            .setContentText(input)
                            .setSmallIcon(R.drawable.ic_racoon)
                            .setContentIntent(pendingIntent)
                            .build();

                    startForeground(1, notification);
                    Toast.makeText(getApplicationContext(), "Foreground service is started.", Toast.LENGTH_LONG).show();

                    break;
                case ACTION_STOP_FOREGROUND_SERVICE:
                    Toast.makeText(getApplicationContext(), "Foreground service is stopped.", Toast.LENGTH_LONG).show();
                    mOsmAndAidlHelper.stopNavigation();
                    break;
                case ACTION_GPX_SERVICE:
                    Uri uri = intent.getParcelableExtra(inputGPX);
                    notification = new NotificationCompat.Builder(this, SmartRacoonApp.CHANNEL_ID)
                            .setContentTitle("SmartRacoon")
                            .setContentText(uri.getPath())
                            .setSmallIcon(R.drawable.ic_racoon)
                            .setContentIntent(pendingIntent)
                            .build();

                    startForeground(1, notification);
                    mOsmAndAidlHelper.navigateGpxFromUri(uri, true);
                    break;
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