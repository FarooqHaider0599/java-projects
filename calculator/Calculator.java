/**
 * @file calculator.java
 * @brief A simple command-line calculator program in Java.
 * 
 * @details This program prompts the user to enter two integers and an arithmetic 
 *          operator (+, -, *, /, %). It uses modern Java switch rules (arrow syntax) 
 *          to perform the calculation and print the result.
 * 
 * @author Farooq Haider
 * @date 2026-07-24
 * @version 1.0
 */
import java.util.Scanner;
public class calculator{
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=========================");
        System.out.println("-------Calculator-------");
        System.out.println("=========================");

        int result=0;

        System.out.println("Enter the number: ");
        int num1 = scanner.nextInt();
        System.out.println("Choose the operator(+,-,*,/,%");
        char op = scanner.next().charAt(0);
        System.out.println("Enter the number: ");
        int num2 = scanner.nextInt();

        if((op == '/' || op == '%') && num2 == 0){
                System.out.println("Error: Division by zero!");
                scanner.close();
                return;
            }
        switch(op){
            case'+' ->
            result = num1 + num2;
            case'-' ->
            result = num1 - num2;
            case'*' ->
            result = num1 * num2;
            case'/' -> 
            result = num1 / num2;
            case'%' ->
            result = num1 % num2;
            default -> 
            System.out.println("Invalid operation!");
        }
        System.out.println("\nResult: "+ result);
        scanner.close();
    }
}
