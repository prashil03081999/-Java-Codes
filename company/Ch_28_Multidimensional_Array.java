package com.company;

public class Ch_28_Multidimensional_Array {
    public static void main(String[] args) {
        int flats [][]= new int [2][3];
        flats[0][1]=101;
        flats[0][0]=102;
        flats[0][2]=103;
        flats[1][0]=104;
        flats[1][1]=105;
        flats[1][2]=106;

        for (int i= 0; i<flats.length;i++ ){
            for (int j= 0; j<flats[i].length;j++ ){
                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println("\n");

        }

    }
}
