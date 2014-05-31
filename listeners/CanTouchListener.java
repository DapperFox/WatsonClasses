package com.watson.listeners;

import com.watson.Main;
import com.watson.RobotSystem;
import lejos.nxt.Sound;

/**
 * Created by blakebishop on 5/29/14.
 */
public class CanTouchListener implements IListener {
    @Override
    public void handleNotification() {
        Main.robotSystem.moveCan();
    }
}
