package com.cput.tristan.Singleton;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Tristan on 2017/04/04.
 */
public class GunTest {

    Gun gun;

    @Before
    public void setUp()
    {
        gun = Gun.getInstance();
    }

    @Test
    public void fire() throws Exception {
        String sound = "";
        for(int i = 0; i < 30; i++)
        {
            sound = gun.fire();
        }
        assertEquals("BANG! ", sound);
        assertEquals(0, gun.getAmmo());
    }

    @Test
    public void reload() throws Exception {
        for(int i = 0; i < 30; i++)
        {
            gun.fire();
        }
        gun.reload();

        assertEquals(30, gun.getAmmo());
    }

}