package com.ldx.keyguard.base;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class LockService extends Service {
    public static final String TAG = "LockService";

    private AttachActionDispatcher mDispatcher = new AttachActionDispatcher();

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
    public IBinder onBind(Intent intent) {
        return null;
    }
}
