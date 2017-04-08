package com.cput.tristan;

import com.cput.tristan.AbstractFactory.Cellphone;
import com.cput.tristan.AbstractFactory.CellphoneFactory;
import com.cput.tristan.AbstractFactory.OldPhoneFactory;
import com.cput.tristan.AbstractFactory.SmartphoneFactory;
import com.cput.tristan.Adapter.Air;
import com.cput.tristan.Adapter.AirConditionerAdapter;
import com.cput.tristan.Adapter.Temperature;
import com.cput.tristan.ChainOfResponsibility.JustRight;
import com.cput.tristan.ChainOfResponsibility.TooFast;
import com.cput.tristan.ChainOfResponsibility.TooSlow;
import com.cput.tristan.Prototype.Newspaper;
import com.cput.tristan.Prototype.Photocopier;
import com.cput.tristan.Singleton.Gun;

import java.io.IOException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){

        switch (Integer.parseInt(display()))
        {
            case 1:
                demonstrateSingleton();
                break;
            case 2:
                demonstrateAbstractFactory();
                break;
            case 3:
                demonstratePrototype();
                break;
            case 4:
                demonstrateAdapter();
                break;
            case 5:
                demonstrateChainOfResponsibility();
                break;
            case 0:
                break;
            default:
                System.out.println("Incorrect entry");
        }



    }

    public static void demonstrateSingleton()
    {
        //This code demonstrates that both p90 and ak47 are referring to the same instance generated in Gun class
        //2 guns would ordinarily fire off 60 bullets, but since theyre referring to the same object, they can't shoot 20 each

        String sound;
        Gun ak47 = Gun.getInstance();
        Gun p90 = Gun.getInstance();

        for(int i = 0; i<20; i++)
        {
            sound = ak47.fire();
            System.out.println((i+1) + " "+sound);
        }


        for(int i = 0; i<20; i++)
        {
            sound = p90.fire();
            System.out.println((i+1) + " "+sound);
        }
    }

    public static void demonstrateAbstractFactory()
    {
        //This demonstrates that both cellphones are declared Cellphone type, but are from different classes and factories
        //This shows that the client need not know from which class these objects were created

        OldPhoneFactory distributor1 = OldPhoneFactory.getInstance();
        SmartphoneFactory distributor2 = SmartphoneFactory.getInstance();

        Cellphone samsung = distributor1.getCellphone("SE250");
        System.out.println(samsung.ring());

        Cellphone huawei = distributor2.getCellphone("HP7");
        System.out.println(huawei.ring());
    }

    public static void demonstratePrototype()
    {
        //This illustrates that while the copy object was declared Photocopier, it is of Newspaper type

        Newspaper original = new Newspaper(47, "Cape Argus", 62);

        Photocopier copy = original.photoCopy();

        System.out.println(copy.getClass());

    }

    public static void demonstrateAdapter()
    {
        Air air = new Air();
        AirConditionerAdapter aircon = new AirConditionerAdapter();
        Temperature temp;

        temp = aircon.get15degrees();

        System.out.println("The room is now " + temp.getTemperature() + " degrees.");

    }

    public static void demonstrateChainOfResponsibility()
    {
        Scanner scan = new Scanner(System.in);
        int speed;
        String message;

        TooFast fast = new TooFast();
        JustRight right = new JustRight();
        TooSlow slow = new TooSlow();

        fast.setSuccessor(right);
        right.setSuccessor(slow);

        System.out.println("Please enter the speed you were going (km/h):");
        speed = scan.nextInt();

        message = fast.checkSpeed(speed);

        System.out.println(message);
    }

    public static String display(){

        Scanner scan = new Scanner(System.in);
        String selection;

        for(int i = 0; i < 25; i++)
        {
            System.out.println("\n");
        }

        System.out.println( "***********************************************\n" +
                            "Please select which question you'd like to test\n" +
                            "1) Singleton\n"+
                            "2) Abstract Factory\n" +
                            "3) Prototype\n"+
                            "4) Adapter \n"+
                            "5) Chain of Responsibility\n" +
                            "0) Exit\n" +
                            "Please enter selection between 0 - 9");

        selection = scan.nextLine();

        return selection;
    }
}
