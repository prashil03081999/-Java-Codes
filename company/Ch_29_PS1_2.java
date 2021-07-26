package com.company;

public class Ch_29_PS1_2 {
    public static void main(String[] args) {
        //Question 2: Searching for element in array
        float check=200;
        float [] marks={100,200,400,700,1400};
        for(float retrieve:marks){
            if(retrieve==check) {
                System.out.println("yes the number u are searching is in in the array marks that is 200");
                break;
            }
        }
    }
}
