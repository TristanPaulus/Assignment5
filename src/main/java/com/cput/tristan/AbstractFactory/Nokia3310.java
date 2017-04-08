package com.cput.tristan.AbstractFactory;

/**
 * Created by Tristan on 2017/04/04.
 */
public class Nokia3310 implements Cellphone {

    @Override
    public String getModel()
    {
        return "Nokia 3310";
    }

    @Override
    public String ring()
    {
        return "*Plays monotone nokia tune*";
    }

}
