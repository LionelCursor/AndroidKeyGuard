package com.ldx.keyguard.base;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * Created by ldx on 2015/9/1.
 */
public class AppData {
    private static Context sContext;

    @NonNull
    public static Context getContext(){
        if (null == sContext){
            throw new IllegalStateException("Init AppData when service started");
        }
        return sContext;
    }

    public static void init(@NonNull Context appContext) {
        if (null == appContext) {
            throw new NullPointerException();
        }
        sContext = appContext;
    }
}
