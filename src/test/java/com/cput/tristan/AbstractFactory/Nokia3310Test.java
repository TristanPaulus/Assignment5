package com.cput.tristan.AbstractFactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/08.
 */
public class Nokia3310Test {

    Cellphone nokia;

    @Before
    public void setUp()
    {
        nokia = new Nokia3310();
    }

    @Test
    public void getModel() throws Exception {
        assertEquals("Nokia 3310", nokia.getModel());
    }

    @Test
    public void ring() throws Exception {
        assertEquals("*Plays monotone nokia tune*", nokia.ring());
    }

}