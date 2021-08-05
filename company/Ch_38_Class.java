package com.company;
class employee{
    int id;
    String name;
    public void details(){
        System.out.print("My name is khan ");
        System.out.println("and Iam 21 Years old");
    }

}

public class Ch_38_Class {
    public static void main(String[] args) {
        employee ram =new employee();
        employee sham =new employee();
        employee sita =new employee();

        ram.details();
        sham.details();
        sita.details();
    }
}
