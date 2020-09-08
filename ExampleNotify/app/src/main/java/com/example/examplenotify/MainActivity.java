package com.example.examplenotify;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    NotificationManager nm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
    }

    public void notify(View view) {
        createNotification();
        sendNotification();
    }

    private void createNotification() {
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel nc = new NotificationChannel("Channel1","Notify",
                    NotificationManager.IMPORTANCE_HIGH);
            nc.enableLights(true);
            nc.setLightColor(Color.GREEN);
            nc.enableVibration(true);
            nc.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
            nm.createNotificationChannel(nc);
        }
    }

    private void sendNotification(){
        Intent i = new Intent(this,MainActivity.class);
        PendingIntent pi =
                PendingIntent.getActivity(this,1,i,PendingIntent.FLAG_UPDATE_CURRENT);
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this,"Channel1");
        builder.setContentTitle("Notify");
        builder.setContentText("This is an notification");
        builder.setSmallIcon(R.drawable.ic_note);
        builder.setContentIntent(pi);
        builder.setAutoCancel(true);
        builder.addAction(R.drawable.ic_launcher_background,"Reply",pi);
        nm.notify(0,builder.build());
    }

}