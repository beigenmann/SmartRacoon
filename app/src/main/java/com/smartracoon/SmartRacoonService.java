package com.smartracoon;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

public class SmartRacoonService extends Service {
    public static final String ie = "inputExtra";

    private OsmAndAidlHelper mOsmAndAidlHelper;

    @Override
    public void onCreate() {
        try {
            mOsmAndAidlHelper = new OsmAndAidlHelper(this, null);
            Toast.makeText(getApplicationContext(),"osmand Connected!",Toast.LENGTH_SHORT).show();
        }
        catch( Exception e){
            Toast.makeText(getApplicationContext(),"osmand not installed!",Toast.LENGTH_SHORT).show();
        }
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String input = intent.getStringExtra(ie);


        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this,
                0, notificationIntent, 0);

        Notification notification = new NotificationCompat.Builder(this, SmartRacoonApp.CHANNEL_ID)
                .setContentTitle("SmartRacoon")
                .setContentText(input)
                .setSmallIcon(R.drawable.ic_racoon)
                .setContentIntent(pendingIntent)
                .build();

        startForeground(1, notification);

        //do heavy work on a background thread
        //stopSelf();

        return START_NOT_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}