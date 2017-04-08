package com.cput.tristan.AbstractFactory;

import javafx.scene.control.Cell;

/**
 * Created by Tristan on 2017/04/04.
 */
public class OldPhoneFactory implements CellphoneFactory{

    private static OldPhoneFactory oldPhoneFactory = null;

    public static OldPhoneFactory getInstance()
    {
        if(oldPhoneFactory == null)
            oldPhoneFactory = new OldPhoneFactory();

        return oldPhoneFactory;
    }

    @Override
    public Cellphone getCellphone(String modelCode)
    {
        if ("N3310".equalsIgnoreCase(modelCode))
        {
            return new Nokia3310();
        }
        else
        {
            return new SamsungE250();
        }
    }

}
