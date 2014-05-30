package com.watson.listeners;

import com.watson.RobotSystem;
import lejos.nxt.Motor;

/**
 * Created by blakebishop on 5/29/14.
 */
public class LineDetectListener implements IListener {
    @Override
    public void handleNotification() {
        RobotSystem system = new RobotSystem();
        system.stop();
        system.moveBackward();
    }
}
