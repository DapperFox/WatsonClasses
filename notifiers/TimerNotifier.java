package com.watson.notifiers;

import com.watson.TimeListenerAndTime;

import java.util.ArrayList;

/**
 * Created by blakebishop on 5/29/14.
 */
public class TimerNotifier implements Runnable {
//    Let listener be a new timer listener and time
//    Run
//    start timer
//
//    Notify Listeners
//    notify listener
//    Register
//            Unregister
    TimeListenerAndTime timeListenerAndTime;
    @Override
    public void run() {
        while(true) {
            //Do timey wimey stuff
        }
    }

    public void register(TimeListenerAndTime listener) {
        timeListenerAndTime = listener;
    }
}
