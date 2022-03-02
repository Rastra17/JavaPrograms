package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearch
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the target: ");
        int target = Integer.parseInt(br.readLine());
        br.close();

        int list[] = {10,40,70,80,100};

        BinarySearch bs = new BinarySearch();
        int check = bs.binSearch(list, target);

        if(check == -1)
        {
            System.out.println("The entered number does not exist!");
        }
        else
        {
            System.out.println("The position in array is: "+ check);
        }
    }

    public static int binSearch(int list[], int target)
    {
        int lower = 0;
        int upper = list.length-1;

        if(target >= list[0] && target <= list[upper])
        {
            while(lower <= upper)
            {
                int middle = (upper+lower)/2;

                if(target < list[middle])
                {
                    upper = middle-1;
                }
                else if(target > list[middle])
                {
                    lower = middle+1;
                }
                else
                {
                    return middle;
                }
            }
        }
        return -1;
    }
}
