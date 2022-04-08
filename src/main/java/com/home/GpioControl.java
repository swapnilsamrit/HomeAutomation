package com.home;

import com.home.scheduler.SprinklerScheduler;

import java.util.Timer;

public class GpioControl {
    Timer t = new Timer();
    SprinklerScheduler s = new SprinklerScheduler();

    public void startSprinkler() {
        t.schedule(s, 1000, 180*100*100);
    }
}
