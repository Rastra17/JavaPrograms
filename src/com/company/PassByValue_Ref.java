package com.company;

// Java is a PbV Language so PbR is not possible

public class PassByValue_Ref {
    public static void PassbyValue(int val) { /* In PbV, the value of original variable is not changed and a new variable is created
        where the value of the original is copied into it */
        val = val + 5;
    }
    public static void main(String args[]) { /* In PbR, the object is passed as an argument to change its value; by doing this, the
        the value of the original variable is changed because it references to the memory address of that original variable*/
        PassByValue_Ref obj = new PassByValue_Ref();
        int x = 5;
        PassByValue_Ref.PassbyValue(x);
        System.out.println(x);
    }
}
