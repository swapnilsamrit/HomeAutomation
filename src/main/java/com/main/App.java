package com.main;

import com.home.sprinkler.SprinklerImpl;

/**
 * Hello world!
 *
 */
class AppMain
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        SprinklerImpl sprinkler=new SprinklerImpl();
        sprinkler.runBatchScript();
    }
}
