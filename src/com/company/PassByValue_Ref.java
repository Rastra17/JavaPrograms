package com.company;

public class PassByValue_Ref {
    public static void PassbyValue(int val) { /* In PbV, the value of original variable is not changed and a new variable is created
        where the value of the original is copied into it */
        val = val + 5;
    }
    public static void main(String args[]) { // Java is a PbV Language so PbR is not possible
        PassByValue_Ref obj = new PassByValue_Ref();
        int x = 5;
        PassByValue_Ref.PassbyValue(x);
        System.out.println(x);
    }
}
