//File handling in Java

package com.company;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class fileHandling
{
    public static void main(String args[])
    {
        File Myfile=new File("filehandling.txt");
        try
        {
            //Object to create a new file
            Myfile.createNewFile();
        }
        catch(Exception e)
        {
            System.out.println("Unable to create this file!");
        }

        //Object to write within a file
        try
        {
            FileWriter writer=new FileWriter("filehandling.txt");
            writer.write("Hello world!");
            writer.close();
        }
        catch(Exception e)
        {
            System.out.println("File doesn't exist!");
        }

        //Reading a file
        try
        {
            Scanner sc=new Scanner(Myfile);
            while(sc.hasNextLine())
            {
                String line=sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }
        catch(Exception e)
        {
            System.out.println("File doesn't exist!");
        }
        //An object within condition to delete a file and print appropriate message
    /*try
    {
      if(Myfile.delete())
      {
        System.out.println(Myfile.getName()+" has been deleted");
      }
      else:
      {
        System.out.println("Something went wrong!");
      }
    }
    catch(Exception e)
    {
      System.out.println("File doesn't exist!");
    }*/
    }
}
