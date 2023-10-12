package org.example;

import java.util.*;
import java.util.Random;
public class generatingRanNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random random=new Random(); //our ide generates the random number
        int randomNumber= random.nextInt(100);
//        System.out.println("Generated random number is : "+randomNumber);
        // the program loops until you guess the correct number
        System.out.println("Enter your number : ");
        for(int i=0;i<randomNumber;i++) {
            int MyGuess=in.nextInt();
            System.out.println("My guess is : "+MyGuess);
            if (randomNumber == MyGuess) {
                System.out.println("Your guess is correct!!!");
                break;
            }else if(randomNumber<MyGuess){
                int num=MyGuess-randomNumber;
//                System.out.println("Difference is "+MyGuess+"-"+randomNumber+"="+ num);
                System.out.println("Your guess is wrong, Try with another guess");
            }else if(randomNumber>MyGuess){
                int num=randomNumber-MyGuess;
                System.out.println("Difference is "+randomNumber+"-"+MyGuess+"="+num);
                System.out.println("Your guess is wrong, Try with another guess");
            }
        }
    }
}
