package com.ldx.keyguard.base;

/**
 * Created by ldx on 2015/9/1.
 * <p/>
 * ViewManager has two public interface. Attaching the specific window on the window, and detach it
 */
public abstract class ViewManager {


    public <T> void attach(Class<? extends ViewManager> which) {

    }

    public <T> void detach(Class<? extends ViewManager> which) {

    }
}
