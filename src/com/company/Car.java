//Implementation of Interface

package com.company;

public class Car implements Vehicle
{
    private int gear=0;
    private int change=0;

    public void changeGear(int gear)
    {
        this.gear=gear;
    }
    public void speedUp(int change)
    {
        this.change+=change;
    }
    public void slowDown(int change)
    {
        this.change-=change;
    }
    public void display()
    {
        System.out.println("Speed: "+this.change+"kms/hr and Gear:"+this.gear);
        out();
    }
    public static void main(String args[])
    {
        Car cr=new Car();
        cr.speedUp(10);
        cr.slowDown(5);
        cr.changeGear(3);
        cr.display();
        int x=Vehicle.math(5);
        System.out.println("The square of 5 is: "+x);
    }
}
