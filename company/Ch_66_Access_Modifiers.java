package com.company;
class C{
    public int c1=23;
    protected int c2=32;
    int c3=12;
    private int c4=21;
    public void meth1(){
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
    }
}

public class Ch_66_Access_Modifiers {
    public static void main(String[] args) {
        C items=new C();
        //items.meth1();
        System.out.println(items.c1);
        System.out.println(items.c2);
        System.out.println(items.c3);
        //System.out.println(items.c4);// we cannot do like this coz of its private member.



    }
}
