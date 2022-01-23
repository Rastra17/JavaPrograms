//Implementation of switch case in java

package com.company;

import java.util.Scanner;

public class Switch
{

    public void switchCase(int input)
    {
        switch(input)
        {
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int scan=obj.nextInt();

        Switch sc=new Switch();
        //Passing in values to the method of the class
        sc.switchCase(scan);

        obj.close();
    }
}
