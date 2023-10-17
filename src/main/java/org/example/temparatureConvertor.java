package org.example;
import java.util.*;
public class temparatureConvertor {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Hello!!! Welcome to temparature convertor");
        System.out.print("Choose the operation you want to convert C,F :");
        char operation=in.next().charAt(0);
        switch (operation) {
            case 'C' -> {
                System.out.println("You are converting temparature from fahrenheit to celsius");
                System.out.print("Enter Fahrenheit value to convert it into celsius :");
                int fahrenheit = in.nextInt();
                int toCelsius = (fahrenheit - 32)*5/9;
                System.out.println("Temparature in clesius is : " + toCelsius + " Celsius");
            }
            case 'F' -> {
                System.out.println("You are converting temparature from celsius to fahrenheit");
                System.out.print("Enter Celsius value to convert it into fahrenheit :");
                int celsius = in.nextInt();
                int toFahrenheit = (celsius * 9/5)+32;
                System.out.println("Temparature in fahrenheit is :" + toFahrenheit + " Fahrenheit");
            }
            default -> {
                System.out.println("You entered wrong operation , Try with correct one!!! ");
            }
        }
    }
}
