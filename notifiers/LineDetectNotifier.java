package com.watson.notifiers;

import com.watson.listeners.IListener;
import lejos.nxt.LCD;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;

import java.util.ArrayList;

/**
 * Created by blakebishop on 5/29/14.
 */
public class LineDetectNotifier implements INotifier, Runnable{
//    Let listeners be a new list of listeners
//
//            Run
//    loop forever...
//    read sensor
//    If a line is detected,
//    Notify listeners
//    Register
//    Add listener to list of listeners
//    Unregister
//    Remove listener to list of listeners
    ArrayList<IListener> listeners = new ArrayList<IListener>();

    public LineDetectNotifier() {
        Thread thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        LightSensor lightSensor = new LightSensor(SensorPort.S1);
        while(true) {
            if(lightSensor.getNormalizedLightValue() < 330) {
                LCD.drawString(""+lightSensor.getNormalizedLightValue(), 0,3);
                for (IListener listener : listeners) {
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
