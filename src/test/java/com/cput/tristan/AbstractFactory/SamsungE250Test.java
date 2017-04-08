package com.cput.tristan.AbstractFactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/08.
 */
public class SamsungE250Test {

    Cellphone e250;

    @Before
    public void setUp()
    {
        e250 = new SamsungE250();
    }

    @Test
    public void getModel() throws Exception {
        assertEquals("Samsung E250", e250.getModel());
    }

    @Test
    public void ring() throws Exception {
        assertEquals("*Plays monotone Samsung tune*", e250.ring());
    }

}