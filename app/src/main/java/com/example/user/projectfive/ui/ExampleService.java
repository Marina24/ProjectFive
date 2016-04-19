package com.example.user.projectfive.ui;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.Toast;


public class ExampleService extends Service {

    final static String LOG = "Жизненый цикл Service";

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(getApplicationContext(), "Service onCreate()", Toast.LENGTH_SHORT).show();
        Log.i(LOG, "onCreate()");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(getApplicationContext(), "Service onStartCommand()", Toast.LENGTH_SHORT).show();
        Log.i(LOG, "onStartCommand()");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Service onDestroy()", Toast.LENGTH_SHORT).show();
        Log.i(LOG, "onDestroy()");
    }
}
