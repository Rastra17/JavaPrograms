//Implementation of inheritance with Buffer I/O Library

package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person extends objects
{
    public String Food;
    public Person(String Name,int Class,int Rollno, String Food)
    {
        super(Name,Class,Rollno);
        this.Food=Food;
    }

    @Override
    public void disp()
    {
        System.out.println("Hello "+this.Name+", your in class "+this.Class+
                ", your roll number is "+this.Rollno+" and your favorite food is "+
                this.Food+'.');
    }
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your name: ");
        String Name=br.readLine();

        System.out.print("Enter your class: ");
        int Class=Integer.parseInt(br.readLine());

        System.out.print("Enter your roll number: ");
        int Rollno=Integer.parseInt(br.readLine());

        System.out.print("Enter your favorite food: ");
        String Food=br.readLine();

        br.close();

        //Passing in values to the constructor of the class
        Person ps=new Person(Name,Class,Rollno,Food);
        ps.disp();
    }
}
