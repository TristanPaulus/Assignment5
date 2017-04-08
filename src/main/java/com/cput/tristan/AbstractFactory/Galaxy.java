package com.cput.tristan.AbstractFactory;

/**
 * Created by Tristan on 2017/04/04.
 */
public class Galaxy implements Cellphone {

    @Override
    public String getModel()
    {
        return "Samsung Galaxy S5";
    }

    @Override
    public String ring()
    {
        return "*Plays mp3 nokia tune*";
    }

}
