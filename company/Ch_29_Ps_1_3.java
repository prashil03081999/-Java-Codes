package com.company;

public class Ch_29_Ps_1_3 {
    public static void main(String[] args) {
        //Question 3: Avg of marks

        float sum=0;
        float avg=0;
        float [] Phy_marks={76,20,40,70,56};
        for(float retrieve:Phy_marks){
            System.out.println(retrieve);
            sum=sum+retrieve;
            avg=sum/Phy_marks.length;
        }
        System.out.print("sum of elements in array is: ");
        System.out.println(sum);
        System.out.print("Avg of Phy_marks  is: ");
        System.out.println(avg);
    }
}
