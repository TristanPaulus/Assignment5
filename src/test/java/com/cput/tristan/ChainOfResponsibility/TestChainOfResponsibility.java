package com.cput.tristan.ChainOfResponsibility;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Tristan on 2017/04/08.
 */
public class TestChainOfResponsibility {

    JustRight right;
    TooSlow slow;
    TooFast fast;

    @Before
    public void setUp()
    {
        right = new JustRight();
        slow = new TooSlow();
        fast = new TooFast();

        fast.setSuccessor(right);
        right.setSuccessor(slow);
    }

    @Test
    public void testCheckSpeed()
    {
        int speed = 40;
        String message;
        message = fast.checkSpeed(speed);

        assertEquals("Too slow", message);
    }

}
