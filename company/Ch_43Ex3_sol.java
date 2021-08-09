package com.company;
import java.util.Scanner;
import java.util.Random;


class games{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;
    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }
    public games(){
        Random rand = new Random();
        this.number = rand.nextInt(100);


    }
    int takeUserInput (){
        Scanner sc=new Scanner(System.in);
        inputNumber=sc.nextInt();
        return inputNumber;

    }
    boolean isCorrectNumber(){
        noOfGuesses ++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}

public class Ch_43Ex3_sol {
    public static void main(String[] args) {
        Game g =new Game();
        boolean b =false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
