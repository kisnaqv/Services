package com.nareshit.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

public class Myservice extends Service {

    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(this, "onBind", Toast.LENGTH_SHORT).show();
        Log.i("Result","onBind");
        return null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
        Log.i("Result","onDestroy");
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
        Toast.makeText(this, "onRebind", Toast.LENGTH_SHORT).show();
        Log.i("Result","onRebind");
    }

    @Override
    public boolean onUnbind(Intent intent) {
        Toast.makeText(this, "onUnbind", Toast.LENGTH_SHORT).show();
        Log.i("Result","onUnbind");
        return super.onUnbind(intent);

    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        Log.i("Result","onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, "onStartCommand", Toast.LENGTH_SHORT).show();
        Log.i("Result","onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

}
