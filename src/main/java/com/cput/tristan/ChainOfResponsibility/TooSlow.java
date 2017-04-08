package com.cput.tristan.ChainOfResponsibility;

/**
 * Created by Tristan on 2017/04/08.
 */
public class TooSlow extends SpeedHandler {

    @Override
    public String checkSpeed(int speed) {
        if(speed < 50)
            return "Too slow";
        else
            return successor.checkSpeed(speed);
    }

}
