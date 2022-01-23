//A program to calculate amount of water in units trapped between two highest buildings

package com.company;

public class arrayBuilding
{
    public void check()
    {
        int weight []={5,3,2,1,3};
        int len=weight.length;
        int max1=0,max2=0,pos1=0,pos2=0,result=0;
        for(int i=0;i<len;i++)
        {
            if(max1<weight[i])
            {
                max1=weight[i];
                pos1=i;
            }
        }
        System.out.println("The tallest building in the array: "+max1);
        for(int i=0;i<len;i++)
        {
            if(max2<weight[i])
            {
                if(i==pos1)
                {
                    continue;
                }
                else
                {
                    max2=weight[i];
                    pos2=i;
                }
            }
        }
        System.out.println("The 2nd tallest building in the array: "+max2);
        System.out.println("The position of tallest building in the array: "+pos1);
        System.out.println("The position of 2nd tallest building in the array: "+pos2);

        if(pos1>pos2)
        {
            for(int i=pos2+1;i<pos1;i++)
            {
                result=result+(max2-weight[i]);
            }
        }
        else
        {
            for(int i=pos1+1;i<pos2;i++)
            {
                result=result+(max2-weight[i]);
            }
        }
        System.out.println("The amount of water filled between buildings: "+result);
    }
    public static void main(String args[])
    {
        arrayBuilding ar=new arrayBuilding();
        ar.check();
    }
}