package com.watson.listeners;

import com.watson.Main;

/**
 * Created by blakebishop on 5/29/14.
 */
public class TimerCompleteListener implements IListener {

    @Override
    public void handleNotification() {
        Main.robotSystem.celebrationMusic();
    }
}
