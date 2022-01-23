//Declaring enumeration constants

package com.company;

public enum Level
{
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    private int lvlNum;

    private Level(int num)
    {
        this.lvlNum=num;
    }
    public int getLevel()
    {
        return this.lvlNum;
    }
    public void setLevel(int num)
    {
        this.lvlNum=num;
    }
}
