//Implementation of enum datatype

package com.company;

public class Enum
{
    public static void main(String args[])
    {
        Level lvl=Level.LOW;
        Level arr[]=Level.values();
        String en=lvl.toString();

        for(Level e:arr)
        {
            System.out.println(e);
        }

        if (lvl==Level.LOW)
        {
            System.out.println(lvl);
        }
        else if(lvl==Level.MEDIUM)
        {
            System.out.println(lvl);
        }
        else
        {
            System.out.println(lvl);
        }
        System.out.println(lvl.getLevel());
        System.out.println(Level.valueOf("LOW"));
        lvl.setLevel(5);
        System.out.println(lvl.getLevel());
    }
}
