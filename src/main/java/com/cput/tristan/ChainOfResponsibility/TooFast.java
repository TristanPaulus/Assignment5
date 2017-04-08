package com.cput.tristan.ChainOfResponsibility;

/**
 * Created by Tristan on 2017/04/08.
 */
public class TooFast extends SpeedHandler {

    @Override
    public String checkSpeed(int speed) {
        if(speed > 100)
            return "Too fast";
        else
            return successor.checkSpeed(speed);
    }

}
