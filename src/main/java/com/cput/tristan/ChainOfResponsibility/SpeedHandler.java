package com.cput.tristan.ChainOfResponsibility;

/**
 * Created by Tristan on 2017/04/08.
 */
public abstract class SpeedHandler {

    SpeedHandler successor;

    public void setSuccessor(SpeedHandler successor)
    {
        this.successor = successor;
    }

    public abstract String checkSpeed(int speed);

}
