package com.main;

import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TestClass {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 19);
        today.set(Calendar.MINUTE, 16);
        today.set(Calendar.SECOND, 0);


        TestTask testTask = new TestTask();
        Timer timer = new Timer();
        timer.schedule(testTask, 1000, 2000);
    }
}

class TestTask extends TimerTask {
    public Calendar getTime(){
        Date date=new Date();
        Calendar today = Calendar.getInstance();
        today.setTime(date);
       /* today.set(Calendar.HOUR_OF_DAY, 21);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);*/
        return today;
    }

    @Override
    public void run() {
        System.out.println("Start %s  time"+LocalTime.now().getHour());
        System.out.println("Calender: "+getTime().get(Calendar.HOUR));
        System.out.println(" "+LocalTime.now()+" :: "+getTime().getTime());
        if (LocalTime.now().equals(getTime())) {
            System.out.println("Time Now: " + LocalTime.now());
        }
    }
}