package com.cput.tristan.AbstractFactory;

/**
 * Created by Tristan on 2017/04/04.
 */
public class SamsungE250 implements Cellphone{

    @Override
    public String getModel()
    {
        return "Samsung E250";
    }

    @Override
    public String ring()
    {
        return "*Plays monotone Samsung tune*";
    }

}
