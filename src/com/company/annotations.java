//Using annotations in java program and creating custom annotations

package com.company;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/*Annotations provide metadata in a program. The compiler
behaves differently if annotations are present within the program*/
public class annotations
{
    /*@SuppressWarnings("Warning Names") will suppress warnings,
    given by the compiler*/
    @SuppressWarnings("deprecation")
    public static void main(String args[])
    {
        PersonClass ps=new PersonClass("Rastra",10,1443);

        ps.disp();
        ps.sum(5,10);

        NokiaASeries ns=new NokiaASeries("Fire",5);

        //To fetch values of the object

    /*<?> is a wildcard which is not restricting a parameter to
    have a specific type*/
        Class<?> c=ns.getClass();
        Annotation an=c.getAnnotation(Smartphone.class);
        Smartphone sp=(Smartphone)an;
        System.out.println("Operating System: "+sp.OS()+"\nVersion: "+sp.version());
    }
}

class PersonClass extends objects
{
    public PersonClass(String Name,int Class,int Rollno)
    {
        super(Name,Class,Rollno);
    }
    //@Override will check if the method below it has overwritten successfully
    @Override
    //Overwriting the method from super class
    public void disp()
    {
        System.out.println("Name: "+this.Name+"\nRollno: "+this.Rollno+
                "\nClass: "+this.Class);
    }
    //@Deprecated will throw a warning if the method below it is called
    @Deprecated
    public int sum(int a,int b)
    {
        System.out.println("Sum: "+a+b);
        return a+b;
    }
}

/*@FunctionalInterface will give an error if there are more than one methods in
an interface*/
@FunctionalInterface
interface myInterface
{
    void thisMethod();
}

/*@Target will aim at a block,
 to specify its use case on what level it will be used on*/
@Target(ElementType.TYPE)

//@Retention will limit the scope of the block till when it will run
@Retention(RetentionPolicy.RUNTIME)

//Creating custom Annotations
@interface Smartphone
{
    //Default will assign base values to variables
    String OS() default "Symbian";
    int version() default 1;
}

//Implementation of Custom Annotations
@Smartphone(OS="Android",version=6)
class NokiaASeries
{
    String model;
    int size;
    public NokiaASeries(String model,int size)
    {
        this.model=model;
        this.size=size;
    }
}
