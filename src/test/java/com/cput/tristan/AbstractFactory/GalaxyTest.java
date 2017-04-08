package com.cput.tristan.AbstractFactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/08.
 */
public class GalaxyTest {

    Cellphone galaxy;

    @Before
    public void setUp()
    {
        galaxy = new Galaxy();
    }

    @Test
    public void getModel() throws Exception {
        assertEquals("Samsung Galaxy S5", galaxy.getModel());
    }

    @Test
    public void ring() throws Exception {
        assertEquals("*Plays mp3 nokia tune*", galaxy.ring());
    }

}