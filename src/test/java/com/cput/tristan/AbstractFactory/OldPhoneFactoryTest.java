package com.cput.tristan.AbstractFactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/08.
 */
public class OldPhoneFactoryTest {

    OldPhoneFactory opf;
    Cellphone e250;

    @Before
    public void setUp()
    {
        opf = OldPhoneFactory.getInstance();
    }

    @Test
    public void getCellphone() throws Exception {

        e250 = opf.getCellphone("SE250");
        assertEquals("Samsung E250", e250.getModel());
    }

}