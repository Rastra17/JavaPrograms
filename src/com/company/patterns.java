//A program to print patterns in java with nested for loop

package com.company;

public class patterns
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {

            for(int j=0;j<=i;j++)
            {

                System.out.print("*");

            }
            System.out.println();
        }

    }
}