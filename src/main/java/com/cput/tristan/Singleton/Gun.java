package com.cput.tristan.Singleton;

/**
 * Created by Tristan on 2017/04/01.
 */
public class Gun {

    private static Gun gun = null;
    private int ammo;

    private Gun()
    {
        ammo = 30;
    }

    public static Gun getInstance()
    {

        if(gun == null)
        {
            gun = new Gun();
        }

        return gun;
    }

    public String fire()
    {
        if(ammo > 0)
        {
            this.ammo = this.ammo - 1;
            return "BANG! ";
        }

        else
            return "click ";

    }

    public void reload()
    {
        ammo = 30;
    }

    public int getAmmo()
    {
        return ammo;
    }

}
