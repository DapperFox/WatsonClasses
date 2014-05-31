package com.watson.listeners;

import com.watson.Main;
import com.watson.RobotSystem;
import lejos.nxt.Motor;

/**
 * Created by blakebishop on 5/29/14.
 */
public class CanSensedListener implements IListener {
    @Override
    public void handleNotification() {
        Main.robotSystem.moveForward();
    }
}
