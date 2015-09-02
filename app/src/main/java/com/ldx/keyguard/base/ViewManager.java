package com.ldx.keyguard.base;

import android.content.Context;
import android.view.View;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by ldx on 2015/9/1.
 * <p/>
 * ViewManager has two public interface. Attaching the specific window on the window, and detach it
 */
public abstract class ViewManager {

    //================================ STATIC FIELD ========================================

    /*package*/ static WindowManagerWrapper sWM = new WindowManagerWrapper();

    /*package*/ static LinkedHashMap<Class<? extends ViewManager>, ViewManager> sVMMap;

    public static <T extends ViewManager> boolean attach(Class<T> clazz) {
        ViewManager aVM = sVMMap.get(clazz);
        if (null == aVM) {
            try {
                aVM = instantiate(clazz);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return false;
            } catch (InstantiationException e) {
                e.printStackTrace();
                return false;
            }
        }
        return true;
    }

    private static boolean attachInner(){
        return false;
    }

    private static <T extends ViewManager> T instantiate(Class<T> clazz) throws IllegalAccessException, InstantiationException {
        return clazz.newInstance();
    }

    public static <T extends ViewManager> void detach(Class<T> clazz) {

    }

    //====================================== FILED ========================================

    public RootViewWrapper mRootViewWrapper = new RootViewWrapper();

    public ViewManager(){
    }

}
