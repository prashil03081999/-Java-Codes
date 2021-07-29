package com.company;

public class Ch_32_Method_Overloading {
    static void change(int [] arr)  // if u will write void then it will not going to return anything it will print whatever u hve mentioned.
    {
        arr[0]=98;
    }
    public static void main(String[] args) {
        int [] marks= {65,75,54,78,65};
        change (marks);
        System.out.println("The value of x after running the program:"+ marks[0]);
    }
}
