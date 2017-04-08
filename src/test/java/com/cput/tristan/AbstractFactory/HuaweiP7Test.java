package com.cput.tristan.AbstractFactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/08.
 */
public class HuaweiP7Test {

    Cellphone p7;

    @Before
    public void setUp()
    {
        p7 = new HuaweiP7();
    }

    @Test
    public void getModel() throws Exception {
        assertEquals("Huawei Ascend P7", p7.getModel());
    }

    @Test
    public void ring() throws Exception {
        assertEquals("*Plays mp3 song of choice*", p7.ring());
    }

}