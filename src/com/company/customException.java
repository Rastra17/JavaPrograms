//To create custom exceptions in Java

package com.company;

import java.util.Scanner;

public class customException
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        int a;
        System.out.print("Enter a number: ");
        a=sc.nextInt();
        sc.close();

        if(a<10)
        {
            try
            {
                //throw keyword displays an Exception where needed
                throw new MyException("Exception thrown","Try to handle it");
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
                System.out.println(e.getMessage());
                System.out.println(e);

                e.printStackTrace();
                System.out.println("Finished");
            }
        }
    }
}

@SuppressWarnings("serial")
class MyException extends Exception
{
    String ts;
    String gm;
    MyException(String ts,String gm)
    {
        this.ts=ts;
        this.gm=gm;
    }
    @Override
    public String toString()
    {
        return this.ts;
    }
    @Override
    public String getMessage()
    {
        return this.gm;
    }
}
