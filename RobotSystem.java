package com.watson;

import com.watson.listeners.*;
import com.watson.notifiers.*;
import lejos.nxt.*;

public class RobotSystem {
//	When the system is created
    boolean systemRunning = true;
    private CanSensedListener csl;
    private CanTouchListener ctl;
    private LineDetectListener ldl;
    private TimerCompleteListener tcl;
    private CanSenseNotifier csn;
    private CanTouchNotifier ctn;
    private LineDetectNotifier ldn;

	public RobotSystem(){
//        csl = new CanSensedListener();
//        ctl = new CanTouchListener();
//        ldl = new LineDetectListener();
//        tcl = new TimerCompleteListener();
//        csn = new CanSenseNotifier();
//        ctn = new CanTouchNotifier();
//        ldn = new LineDetectNotifier();

//        ldn.register(ldl);
		//  Let canSenseListener be a new CanSenseListeners
        //	Let canTouchListener be a new CanTouchListener
        //	Let lineDetectListener be a new LineDetectListener
        //	Let timeCompleteListener be a new TimeCompletedListener
        //	Let timerListenerAndTime be a new TimerListenerAndTime
	}

    public void test() {
        while(true) {
            LightSensor ls = new LightSensor(SensorPort.S1);
            LCD.drawString("" + ls.readNormalizedValue(), 0, 0);
        }
    }
    //  Search for can
    public void searchForCan() {
        csn.register(csl);
        ctn.register(ctl);
        rotate();
    //	Register canSenseListener
    //  Register canTouchListener
    //  Rotate
    }
//Set timerListenerAndTimes listener to be timeCompleteListener
//		Set timerListenerAndTimes time to be 60 seconds
//
//		Register lineDetectListener
//		Register timeListenerAndTime

//	Rotate
    public void rotate() {
//		Move one motor forward
//		Move second motor backward
        Motor.B.setSpeed(200);
        Motor.C.setSpeed(200);
        Motor.B.forward();
        Motor.C.backward();
    }
//	Move Forward
//		Move both motors forward
    public void moveForward() {
        Motor.B.setSpeed(300);
        Motor.C.setSpeed(300);
        Motor.B.forward();
        Motor.C.forward();
    }
//
//	Move Can
    public void moveCan() {
        moveForward();
        Sound.beep();
//			Move forward
//			Play solid tone
    }
//	Move Backward
    public void moveBackward() {
        csn.unregister(csl);
        ctn.unregister(ctl);

        Motor.B.setSpeed(300);
        Motor.C.setSpeed(300);
        Motor.B.backward();
        Motor.C.backward();

        //todo implement timer here
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        stop();
        searchForCan();
        //		Unregister canSenseListener
//		Unregister canTouchListener
//		Let backupTimerListernerAndTime be a new TimerListnerAndTime
//		Let timeCompleteListener be a new TimeComleteListener
//		Let time be 3 seconds
//		Set backupTimerListernerAndTime TimeListener
//		Register timeCompleteListener with Timer Notifier
//		Loop until notified by timer or line sensor...
//		Move both motors backward
//			Play beep
//		...
//		Search for Can
    }

//	Stop
    public void stop() {
        Motor.B.stop();
        Motor.C.stop();
    }
//		Stop motors from moving forwards or backwards
//
//	Beep
    public void beep() {
        //todo may change to beep
        Sound.beepSequence();
//		Play beep
    }
//Solid Tone
    public void tone() {
        //todo figure out solid tone
//		Play solid tone
        Sound.buzz();
    }

//	Celebration Music
    public void celebrationMusic() {
        Sound.twoBeeps();
//		Play celebration music
    }


}
