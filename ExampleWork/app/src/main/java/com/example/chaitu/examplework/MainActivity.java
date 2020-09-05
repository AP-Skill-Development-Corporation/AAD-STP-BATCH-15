package com.example.chaitu.examplework;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import android.os.Bundle;
import android.view.View;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    PeriodicWorkRequest firstRequest;
    OneTimeWorkRequest secondRequest,thirdRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Constraints c = new Constraints
                .Builder()
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build();
        firstRequest = new PeriodicWorkRequest
                .Builder(FirstWork.class,15, TimeUnit.MINUTES)
                .build();
        /*secondRequest = new OneTimeWorkRequest
                .Builder(SecondWork.class)
                .setInitialDelay(5,TimeUnit.SECONDS)
                .build();*/
        secondRequest = new OneTimeWorkRequest
                .Builder(SecondWork.class)
                .setConstraints(c)
                .build();
        thirdRequest = new OneTimeWorkRequest.Builder(ThirdWork.class).build();
    }

    public void trigger(View view) {
       // WorkManager.getInstance(this).enqueue(firstRequest);
       // WorkManager.getInstance(this).beginWith(secondRequest).then(thirdRequest).enqueue();
        WorkManager.getInstance(this).enqueue(secondRequest);
        WorkManager.getInstance(this).enqueue(thirdRequest);
    }
}