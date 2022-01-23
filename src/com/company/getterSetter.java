//Using getters, setters and access modifiers

package com.company;

public class getterSetter
{
    public static void main(String args[])
    {
        MyEmployee me=new MyEmployee();
        me.setName("Red");
        System.out.println(me.getName());
        me.setID(1443);
        System.out.println(me.getID());
    }
}
class MyEmployee
{
    private int id;
    private String name;

    public String getName()
    {
        return name;
    }
    public void setName(String Name)
    {
        //Constructing objects outside constructor
        this.name=Name;
    }
    public int getID()
    {
        return id;
    }
    public void setID(int Id)
    {
        //Constructing objects outside constructor
        this.id=Id;
    }
}
