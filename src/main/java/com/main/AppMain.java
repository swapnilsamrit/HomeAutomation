package com.main;

import com.home.GpioControl;

/**
 * Hello world!
 */
class AppMain {

    public AppMain() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        GpioControl gpioControl = new GpioControl();
        //sprinkler.runSprinkler();
        gpioControl.startSprinkler();

    }

}
