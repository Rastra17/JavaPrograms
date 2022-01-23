//Creating a user-defined class for inheritance

package com.company;

public class objects
{
    public String Name;
    public int Class;
    public int Rollno;

    public objects(String Name, int Class, int Rollno)
    {
        this.Name   = Name;
        this.Class  = Class;
        this.Rollno = Rollno;
    }
    public void disp()
    {
        System.out.println("Name: "+this.Name+"\nClass: "+this.Class+
                "\nRollno: "+this.Rollno);
    }
}
