package com.company;

public class Ch_24_Break_Continue {
    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            if(i==2){
                System.out.println("End of the loop");
                 continue;//break;
            }
            System.out.println("HHuurreeyy");
        }
    }
}
