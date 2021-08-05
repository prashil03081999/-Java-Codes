package com.company;
 class Employee1{
     int Salary;
     String name;

     public int getSalary() {
         return Salary;
     }

     public String getName() {
         return name;
     }
     public void setName(String n){
         name=n;
     }
 }

public class Ch_39_Ps1 {
    public static void main(String[] args) {
        Employee1 perry =new Employee1();
        perry.setName("kettyPerry");
        System.out.println(perry.getName());
        perry.Salary=233333;
        System.out.println(perry.getSalary());

    }
}
