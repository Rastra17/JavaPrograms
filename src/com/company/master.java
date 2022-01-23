//To utilize all datatypes and operators in a single file
package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class master
{
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    boolean g;
    char h;
    String i;
    public master(byte a,short b,int c,long d,float e,double f,boolean g, char h,
                  String i)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
        this.f=f;
        this.g=g;
        this.h=h;
        this.i=i;
    }
    public void datatypes()
    {
        System.out.println("Datatypes Section:");
        System.out.println();

        System.out.println("Byte datatype: "+this.a);
        System.out.println("Short datatype: "+this.b);
        System.out.println("Integer datatype: "+this.c);
        System.out.println("Long datatype: "+this.d);
        System.out.println("Float datatype: "+this.e);
        System.out.println("Double datatype: "+this.f);
        System.out.println("Boolean datatype: "+this.g);
        System.out.println("Character datatype: "+this.h);
        System.out.println("String datatype: "+this.i);
        System.out.println();
    }
    public void operators()
    {
        System.out.println("Operators Section:");
        System.out.println();

        System.out.println("Concatenation: "+(this.h+this.i));
        System.out.println();

        System.out.println("Post-Increment operator: "+(this.b++));
        System.out.println("Post-Decrement operator: "+(this.b--));
        System.out.println("Pre-Increment operator: "+(++this.b));
        System.out.println("Pre-Decrement operator: "+(--this.b));
        System.out.println();

        System.out.println("Addition: "+(this.c+this.b));
        System.out.println("Substraction: "+(this.c-this.b));
        System.out.println("Division: "+(this.c/this.b));
        System.out.println("Multiplication: "+(this.c*this.b));
        System.out.println("Modulus: "+(this.c%this.b));
        System.out.println();

        System.out.println("Greater Operator: "+(this.a>this.b));
        System.out.println("Lesser Operator: "+(this.a<this.b));
        System.out.println("Greater than equals Operator: "+(this.a>=this.b));
        System.out.println("Less than equals Operator: "+(this.a<=this.b));
        System.out.println("Equals Operator: "+(this.g==!this.g));
        System.out.println("Not Equals Operator: "+(this.g!=!this.g));
        System.out.println();

        System.out.println("Not Operator: "+(!(this.g)));
        System.out.println("And Operator: "+(this.a>this.b && this.c==this.d));
        System.out.println("Or Operator: "+(this.a==this.b || this.c>this.d));
        System.out.println();

        System.out.println("Simple Assignment: "+(this.c=this.c+1));
        System.out.println("Plus Assignment: "+(this.b+=1));
        System.out.println("Minus Assignment: "+(this.b-=1));
        System.out.println("Mutiply Assignment: "+(this.b*=1));
        System.out.println("Division Assignment: "+(this.b/=1));
        System.out.println("Modulus Assignment: "+(this.b%=1));

        int check=(this.c<this.b)?this.c:this.b;
        System.out.println("Ternary operator: "+(check));
        System.out.println();

        //Limiting the length of an array and inserting values with do-while loop
        int single[]=new int[5];
        int count=1;
        do
        {
            single[count-1]=count;
            count++;
        }
        while(count<=single.length);

        //Printing 1D array using for-each loop
        System.out.println("Single-dimensional array:");
        //For each element in array
        for(int i:single)
        {
            System.out.println(i);
        }
        //Declaring Multi-Dimensional array which an array within another
        int multi[][]={{1,2,3},{2,4,5},{4,4,5}};

        //Printing 2D array using for-each loop
        System.out.println("Multi-dimensional array:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(multi[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //To print the array location
        System.out.println("Location of array: "+single);
        //To print the array contents
        String display=Arrays.toString(single);
        System.out.println("Contents of array: "+display);
        //To print the contents of multi-dimensional array
        System.out.println("");
        display=Arrays.deepToString(multi);
        System.out.println(display+" ");
        System.out.println();

        //Creating a set
        Set<String> hash_Set = new HashSet<String>();
        hash_Set.add("Red");
        hash_Set.add("Blue");
        hash_Set.add("Red");
        hash_Set.add("Yellow");
        hash_Set.add("Green");
        System.out.println("Sets: "+hash_Set);
    }
    public static void main(String args[])
    {
        master ms=new master((byte)1,(short)2,3,456_789L
                ,5.5F,256.256,true,'H',"ello");
        ms.datatypes();
        ms.operators();
    }
}
