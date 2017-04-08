package com.cput.tristan.AbstractFactory;

/**
 * Created by Tristan on 2017/04/04.
 */
public class HuaweiP7 implements Cellphone{

    @Override
    public String getModel()
    {
        return "Huawei Ascend P7";
    }

    @Override
    public String ring()
    {
        return "*Plays mp3 song of choice*";
    }

}
