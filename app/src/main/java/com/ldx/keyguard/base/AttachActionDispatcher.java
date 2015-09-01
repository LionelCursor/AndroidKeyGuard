package com.ldx.keyguard.base;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.ldx.keyguard.KeyGuardManager;

import java.util.HashMap;

/**
 * Created by meitu on 2015/9/1.
 * All viewManager impl should be added in ths file.
 * And this file will decided a specific action will be dispatched in which ViewManagerImpl
 */
public class AttachActionDispatcher {
    public static final String ACTION_NOTHING = "nothing";
    public static final String ACTION_ATTACH_MAIN = KeyGuardManager.class.getName();
    public HashMap<String, Class<? extends ViewManager>> dispatchMap = new HashMap<>(10);

    {
        //Default items
        dispatchMap.put("", KeyGuardManager.class);
        dispatchMap.put(null, KeyGuardManager.class);
        dispatchMap.put(ACTION_ATTACH_MAIN, KeyGuardManager.class);
        dispatchMap.put(ACTION_NOTHING, null);
    }

    @NonNull
    public HashMap<String, Class<? extends ViewManager>> getDispatchMap() {
        return dispatchMap;
    }

    @Nullable
    public Class<? extends ViewManager> getDispatched(String action) {
        return dispatchMap.get(action);
    }

}
