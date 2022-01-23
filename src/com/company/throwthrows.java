//Implementation of exception handlers in a file with custom exception
package com.company;

public class throwthrows
{
    /*throws keyword warns the programmer that a method may raise an Exception
    which should be caught with try-catch block when method is called*/
    public static double area(int r) throws NegativeRadiusException
    {
        if(r<0)
        {
            //throw keyword displays an Exception where needed
            throw new NegativeRadiusException("Radius cannot be negative!",
                    "Please enter a valid radius");
        }
        double result=3.1415*r*r;
        return result;
    }
    public static int divide(int num1,int num2) throws ArithmeticException
    {
        int result=num1/num2;
        return result;
    }
    public static void main(String args[])
    {
        try
        {
            int take=divide(10,5);
            System.out.println(take);
            double ar=area(-6);
            System.out.println(ar);
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}

//@SuppressWarnings("Warning Names") will supress warning given by the compiler
@SuppressWarnings("serial")
class NegativeRadiusException extends Exception
{
    String ts;
    String gm;
    NegativeRadiusException(String ts,String gm)
    {
        this.ts=ts;
        this.gm=gm;
    }
    /*@Override annotation is used for checking the method, already defined within
    superclass, if they have been overwritten successfully,which otherwise would
    throw an error or exception*/
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
