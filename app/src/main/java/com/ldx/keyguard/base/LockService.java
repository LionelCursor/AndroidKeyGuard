package com.ldx.keyguard.base;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

import java.util.ArrayList;
import java.util.List;

public class LockService extends Service {

    public static final String TAG = "LockService";

    public LockService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        AppData.init(this.getApplicationContext());
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    private void onAttach(Class<? extends ViewManager> viewManager){

    }

    private void onDetach(Class<? extends ViewManager> viewManager){

    }

    public void onEvent(ActionEvent event) {

    }
}
