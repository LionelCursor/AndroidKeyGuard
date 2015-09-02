package com.ldx.keyguard.base;

/**
 * Created by meitu on 2015/9/1.
 */
public class ActionEvent {

    public ActionType mAction;

    public Class<?extends ViewManager> mDes;

    public enum ActionType{
        ATTACH,
        DETACH
    }
}
