package com.cput.tristan.AbstractFactory;

/**
 * Created by Tristan on 2017/04/04.
 */
public class SmartphoneFactory implements CellphoneFactory{

    private static SmartphoneFactory instance = null;

    public static SmartphoneFactory getInstance()
    {
        if(instance == null)
            return new SmartphoneFactory();
        return instance;
    }

    @Override
    public Cellphone getCellphone(String modelCode)
    {
        if("SGS5".equalsIgnoreCase(modelCode))
            return new Galaxy();
        else
            return new HuaweiP7();
    }

}
