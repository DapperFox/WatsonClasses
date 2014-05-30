package com.watson.notifiers;

import com.watson.listeners.IListener;
import lejos.nxt.LCD;
import lejos.nxt.SensorPort;
import lejos.nxt.UltrasonicSensor;

import java.util.ArrayList;

/**
 * Created by blakebishop on 5/29/14.
 */
public class CanSenseNotifier implements INotifier, Runnable{
    ArrayList<IListener> listeners = new ArrayList<IListener>();

    public CanSenseNotifier() {
        Thread thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        UltrasonicSensor ultrasonicSensor = new UltrasonicSensor(SensorPort.S4);
        while(true) {
            if(ultrasonicSensor.getRange() < 150) {
                for(IListener listener : listeners){
                    listener.handleNotification();
                }
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
