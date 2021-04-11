package org.universal.javaprogramming.designPatterns;

import java.util.Random;

//Nano.java

class Nano extends BasicCar
{
    //A base price for Nano
    public int basePrice=100000;
    public Nano(String m)
    {
        modelName = m;
    }
    @Override
    public BasicCar clone() throws CloneNotSupportedException
    {
         return (Nano)super.clone();
         //return this.clone();
    }
}
//Ford.java

class Ford extends BasicCar
{
    //A base price for Ford
    public int basePrice=100000;
    public Ford(String m)
    {
        modelName = m;
    }
    @Override
    public BasicCar clone() throws CloneNotSupportedException
    {
        return (Ford)super.clone();
    }
}
//Client
// PrototypePatternExample.java

public class PrototypePatternExample
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        System.out.println("***Prototype Pattern Demo***\n");
        BasicCar nano = new Nano("Green Nano") ;
        nano.basePrice=100000;
        BasicCar ford = new Ford("Ford Yellow");
        ford.basePrice=500000;
        BasicCar bc1;
        //Nano
        bc1 =nano.clone();
        //Price will be more than 100000 for sure
        bc1.onRoadPrice = nano.basePrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is: "+ bc1.modelName+" and it's price is Rs."+bc1.onRoadPrice);
        //Ford
        bc1 =ford.clone();
        //Price will be more than 500000 for sure
        bc1.onRoadPrice = ford.basePrice+BasicCar.setAdditionalPrice();
        System.out.println("Car is: "+ bc1.modelName+" and it's price is Rs."+bc1.onRoadPrice);
    }
}