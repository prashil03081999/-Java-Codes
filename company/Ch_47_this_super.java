package com.company;
class ekClass{
    int a;
//    public int returnOne(){
//        return 1;
//    }
    ekClass(){
        System.out.println("normal constructor of ekclass without argument");
    }
    ekClass(int v){
        this.a=54;
    }

    public int getA() {
        return a;
    }
}
class Do extends ekClass{
    Do(int c,int v){
        super(v);
        System.out.println("I am constructor of do class"+ c);
    }




}
public class Ch_47_this_super {
    public static void main(String[] args) {

        Do d= new Do(6,7);


    }
}
