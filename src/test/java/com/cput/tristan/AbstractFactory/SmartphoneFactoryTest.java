package com.cput.tristan.AbstractFactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/08.
 */
public class SmartphoneFactoryTest {

    SmartphoneFactory sf;
    Cellphone p7;

    @Before
    public void setUp()
    {
        sf = SmartphoneFactory.getInstance();
    }

    @Test
    public void getCellphone() throws Exception {

        p7 = sf.getCellphone("HP7");
        assertEquals("Huawei Ascend P7", p7.getModel());
    }

}