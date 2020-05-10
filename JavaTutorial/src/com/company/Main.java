package com.company;


import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String answer;

         do {
             System.out.print("Number: ");
                int number = input.nextInt(); 
             if (number % 5 == 0 && number % 3 == 0)
                 System.out.println("FizzBuzz");
             else if (number % 5 == 0)
                 System.out.println("Fizz");
             else if (number % 3 == 0)
                 System.out.println("Buzz");
             System.out.println("Would you like to play again? Yes or No? ");
             answer = input.next();

         }while(answer.equals("yes"));








        



    }

}
