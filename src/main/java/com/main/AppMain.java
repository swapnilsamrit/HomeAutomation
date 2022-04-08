package com.main;

import com.home.GpioControl;
import org.apache.log4j.Logger;

/**
 * Hello world!
 */
class AppMain {
    static Logger logger = Logger.getLogger(AppMain.class);

    public AppMain() {
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        logger.info("Hello World! Pi's Log4j logs");
        GpioControl gpioControl = new GpioControl();
        //sprinkler.runSprinkler();
        gpioControl.startSprinkler();
    }
}
