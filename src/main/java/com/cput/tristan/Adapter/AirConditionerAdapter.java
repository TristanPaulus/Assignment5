package com.cput.tristan.Adapter;

/**
 * Created by Tristan on 2017/04/08.
 */
public class AirConditionerAdapter extends Air implements AirConditioner {

    @Override
    public Temperature get30degrees() {
        return getTemperature();
    }

    @Override
    public Temperature get15degrees() {
        Temperature temp = getTemperature();
        return coolAir(temp, 2);
    }

    @Override
    public Temperature get10degrees() {
        Temperature temp = getTemperature();
        return coolAir(temp, 3);
    }

    @Override
    public Temperature get5degrees() {
        Temperature temp = getTemperature();
        return coolAir(temp, 6);
    }

    private Temperature coolAir(Temperature temp, int i)
    {
        return new Temperature(temp.getTemperature()/i);
    }

}
