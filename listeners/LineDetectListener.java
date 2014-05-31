package com.watson.listeners;

import com.watson.Main;

/**
 * Created by blakebishop on 5/29/14.
 */
public class LineDetectListener implements IListener {
    //todo if it's moving backward it needs to move forward
    @Override
    public void handleNotification() {
        Main.robotSystem.moveBackward();
    }
}