package com.company;

import java.util.ArrayList;

public class Ch_91_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> A1=new ArrayList<>();
        ArrayList<Integer> A2=new ArrayList<>();
        A1.add(6);
        A1.add(7);
        A1.add(8);
        A1.add(9);
        A1.add(10);
        A1.add(0,11);
        A2.add(12);
        A2.add(13);
        A2.add(14);
        A2.add(15);
        //A1.addAll(A2);
        A1.addAll(0,A2);

        for(int i=0;i<A1.size();i++){
            System.out.print(A1.get(i));
            System.out.print(", ");
        }
//        System.out.println(A1.contains(25));
//        System.out.println(A1.contains(7));
//        System.out.println(A2.indexOf(13));
    }
}
