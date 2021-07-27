package com.company;

public class Ch_29_Ps_1_4 {
    public static void main(String[] args) {

        //Question 4:addition of two matrices of 2X3:

        int mat1[][] = {{1, 2, 3},
                {4, 5, 6}};
        int mat2[][] = {{7, 8, 9},
                {10, 11, 12}};
        int add[][] = {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                add[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println("\n");

        }

    }
}