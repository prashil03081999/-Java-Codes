package com.company;
class rectangle{
    public int l;
    public int b;

    public rectangle(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public rectangle() {
        this.l = 4;
        this.b = 5;
    }
}

public class Ch_45_Ps4 {
    public static void main(String[] args) {
        rectangle rec=new rectangle(45,67);
        System.out.println(rec.b);
        System.out.println(rec.l);




    }
}
