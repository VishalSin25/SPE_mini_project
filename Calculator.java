package org.example;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    private static final Logger logger = LogManager.getLogger(Calculator.class);


    public Calculator() {
    }

    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        do {
            System.out.println("Scientific Calculator using DevOps. \n Choose operation:");
            System.out.print("1. Addition\n"+ "2. Exit\nEnter your choice: ");
            int choice;
            try {
                choice = scanner.nextInt();
            } catch (InputMismatchException error) {
                return;
            }
            switch (choice) {
                case 1:
                    // Factorial
                    System.out.print("Enter first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Addition of " + number1 +"and"+ number2 +" is : " + calculator.Addition(number1, number2));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting....");
                    return;


            }

        }while(true);




    }
    public double Addition(double number1,double number2) {
        logger.info("[POWER - " + number1 + " RAISED TO] " + number2);
        double result= number1+number2;
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

}
