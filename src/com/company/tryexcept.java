//Implementing try and except Exception handlers
package com.company;

public class tryexcept
{
    public static void main(String args[])
    {
        try
        {
            int a[]={1,5,7,9};
            System.out.println(a[4]);
        }
        catch(Exception e)
        {
            System.out.println("An exception occurred!: "+e);
        }
    }
}
