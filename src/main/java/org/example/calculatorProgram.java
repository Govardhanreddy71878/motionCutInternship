package org.example;

import java.util.*;
public class calculatorProgram {
    public static void main(String[] args) {
        //creating object for Scanner class
        Scanner in=new Scanner(System.in);
        System.out.println("Hello user , Want to play with the numbers? ");
        System.out.print("choose the operator from +,-,*,/ : " );
        char ChooseOperator=in.next().charAt(0); //declaring the character to choose the operator to perform operations
        if (ChooseOperator == '+') {System.out.println("You are performing the addition operation");}
        else if (ChooseOperator=='-') {System.out.println("You are performing the subtraction operation");}
        else if (ChooseOperator=='*') {System.out.println("You are performing the multiplication operation");}
        else if (ChooseOperator=='/'){System.out.println("You are performing the division operation");}
        System.out.print("Enter 1st number : ");
        double num1=in.nextDouble(); //Taking input 1 from scanner class
        System.out.print("Enter 2nd number : ");
        double num2=in.nextDouble(); //Taking input 2 from scanner class
        double result;
        switch (ChooseOperator){
            case '+': result=num1+num2;
                System.out.println(result+ " is your result"); //prints the output by adding the given inputs
                break;
            case '-': result=num1-num2;
                System.out.println(result+ " is your result"); //prints the output by subtracting the given inputs
                break;
            case '*': result=num1*num2;
                System.out.println(result+" is your result"); //prints the output by multiplying the given inputs
                break;
            case '/': result=num1/num2;
                System.out.println(result+" is your result"); //prints the output by diving the given inputs
                break;
            default:
                System.out.println("You entered the different operator. Try with another!");
        }
    }
}
