package com.cput.tristan.Adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/08.
 */
public class TemperatureTest {

    Temperature t;

    @Before
    public void setUp()
    {
        t = new Temperature(25);
    }

    @Test
    public void getTemperature() throws Exception {
        assertEquals(25, t.getTemperature());
    }

    @Test
    public void setTemperature() throws Exception {
        t.setTemperature(30);
        assertEquals(30, t.getTemperature());
    }

}