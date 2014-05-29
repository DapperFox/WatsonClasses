package com.watson.notifiers;

import com.watson.listeners.IListener;

import java.util.ArrayList;

/**
 * Created by blakebishop on 5/29/14.
 */
public class CanSenseNotifier implements INotifier, Runnable{
    ArrayList<IListener> listeners = new ArrayList<IListener>();
    @Override
    public void run() {
        while(true) {
            //read sensor
            //if can sensed
            for(IListener listener : listeners){
                listener.handleNotification();
            }
        }
    }

    @Override
    public void register(IListener listener) {
        listeners.add(listener);
    }

    @Override
    public void unregister(IListener listener) {
        listeners.remove(listener);
    }
}
