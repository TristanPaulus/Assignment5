package com.cput.tristan.Adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/08.
 */
public class AirConditionerAdapterTest {

    AirConditionerAdapter aircon;
    Temperature temp;

    @Before
    public void setUp()
    {
        aircon = new AirConditionerAdapter();
        temp = new Temperature(30);
    }

    @Test
    public void get30degrees() throws Exception {
        temp = aircon.get30degrees();
        assertEquals(30, temp.getTemperature());
    }

    @Test
    public void get15degrees() throws Exception {
        temp = aircon.get15degrees();
        assertEquals(15, temp.getTemperature());
    }

    @Test
    public void get10degrees() throws Exception {
        temp = aircon.get10degrees();
        assertEquals(10, temp.getTemperature());
    }

    @Test
    public void get5degrees() throws Exception {
        temp = aircon.get5degrees();
        assertEquals(5, temp.getTemperature());
    }

}