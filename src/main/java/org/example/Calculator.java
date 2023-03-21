package org.example;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
//    System.setProperty("log4j.configurationFile","./src/main/resources/log4j2.xml");

    public static void main(String []args) {
        double a, b;
        int choice=0;
        do {
            System.out.println("\n\n\n------welcome to scientific calculator-------\n");
            logger.info("A user entered !");

            System.out.println("Scientific Calculator");
            System.out.println("---------------------");
            System.out.println("1. Factorial function ");
            System.out.println("2. Natural logarithm");
            System.out.println("3. Square root");
            System.out.println("4. Power function ");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            Scanner sc = new Scanner(System.in);
             choice = sc.nextInt();

            long res1 = 0;
            double res2 = 0.0;
            if(choice<1 || choice>5)
            {
                System.out.println("invalid choice!\n\n");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("enter a number :");
                    a = sc.nextDouble();
                    try {
                        res1 = fact(a);
                        System.out.println("Factorial of "+a+" is = "+res1);
                    }
                    catch (ArithmeticException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("enter a number :");
                    a = sc.nextDouble();
                    try {
                        res2 = log(a);
                        System.out.println("Natural logarithm of "+a+" is = "+res2);
                    }
                    catch (ArithmeticException e)
                    {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("enter a number :");
                    a = sc.nextDouble();
                    try {
                        res2 = sqrt(a);
                        System.out.println("Square root of "+a+" is = "+res2);
                    }
                    catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("enter 2 numbers :");
                    a=sc.nextDouble();
                    b=sc.nextDouble();
                    System.out.println("Power of "+a+"is = "+pow(a,b));
                    break;
                case 5:
                    logger.info("Exit");
                    System.out.println("Exiting...");
                    break;
                default:
                    logger.info("Invalid choice");
                    System.out.println("Invalid choice. Please try again.");
            }
//            if(choice!=5)
//            {
//                System.out.println("Exiting application !");
//                break;
//            }
        }while(choice!=5);
    }

    public static long fact(double a)
    {
        if(a<0)
        { logger.error("Factorial of number less than 0 cant be found");

            throw new ArithmeticException("Factorial of number less than 0 cant be found");}

        long result = 1;
        for (int factor = 2; factor <= a; factor++) {
            result *= factor;
        }
        logger.info("Factorial of "+a);
        logger.info("!"+a+" = "+result);

        return result;
    }
    public static double pow(double a, double b)
    {
        logger.info(a+" raised to power "+b);
        logger.info(a+"^"+b+" = "+Math.pow(a,b));
        return Math.pow(a,b);
    }
    public static double log(double a)
    {
        if(a<=0)
        { logger.error("Log of number less than equal to 0 cant be found");
            throw new ArithmeticException("Log of number less than 0 cant be found");
        }
        logger.info("Natural logarithm of"+a);
        logger.info("log("+a+") = "+Math.log(a));
        return Math.log(a);
    }
    public static double sqrt(double a)
    {
        if(a<0)
        { logger.error("Square root of number less than 0 cant be found");

            throw new ArithmeticException("Square root of number less than 0 cant be found");
        }
        logger.info("Square root of "+a+" = "+Math.sqrt(a));
        return Math.sqrt(a);
    }
}