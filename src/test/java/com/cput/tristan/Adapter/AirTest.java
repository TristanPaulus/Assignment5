package com.cput.tristan.Adapter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/08.
 */
public class AirTest {
    @Test
    public void getTemperature() throws Exception {

        Air air = new Air();
        Temperature t = air.getTemperature();
        assertEquals(30, t.getTemperature());

    }

}