package com.cput.tristan.ChainOfResponsibility;

/**
 * Created by Tristan on 2017/04/08.
 */
public class JustRight extends SpeedHandler{

    @Override
    public String checkSpeed(int speed) {
        if(speed > 50 & speed < 100)
            return "Just Right";
        else
            return successor.checkSpeed(speed);
    }

}
