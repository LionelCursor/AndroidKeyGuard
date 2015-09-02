package com.ldx.keyguard.base;

import android.view.WindowManager;

/**
 * Created by ldx on 2015/9/1.
 */
public class WindowManagerWrapper {

    WindowManager mWM;

    public boolean attachView(ViewManager viewManager){
//        mWM.addView(viewManager.getRootView(),);
        return false;
    }
}
