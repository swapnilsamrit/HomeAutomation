package com.home.scheduler;

import com.home.sprinkler.SprinklerImpl;

import java.util.Date;
import java.util.TimerTask;

/**
 * This class will run the scheduler at configured time interval
 */
public class SprinklerScheduler extends TimerTask {
    SprinklerImpl sprinkler = new SprinklerImpl();

    @Override
    public void run() {
        System.out.println("Turn On SPRINKLER: " + new Date().getSeconds());
        System.out.println("Get toInstant : " + new Date().toInstant());
        System.out.println("getTime "+new Date().getTime());

        /*try {
            sprinkler.turnOn17sh();
            //sprinkler.turnOff17sh();
            System.out.println("Sleeping for 5 sec");
            Thread.sleep(5000);
            sprinkler.turnOff17sh();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println("Turn Off SPRINKLER" + new Date().getSeconds());
    }
}
