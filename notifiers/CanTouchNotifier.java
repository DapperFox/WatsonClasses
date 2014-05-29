package com.watson.notifiers;

import com.watson.listeners.IListener;

import java.util.ArrayList;

public class CanTouchNotifier implements INotifier, Runnable {
//	Let listeners be a new list of listeners

//	Run
//		loop forever...
//			read sensor
//			if sensor is pressed,
//				Notify Listeners
//	Register
//		Add listener to list of listeners
//	Unregister
//		Remove listener from list of listeners
    ArrayList<IListener> listeners = new ArrayList<IListener>();
    @Override
    public void run() {
        while(true) {
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
