package week1Xenosisproj;

import java.util.Scanner;

public class kausik01 {
	

		

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter an operator (+, -, *, /): ");
	        char operator = scanner.next().charAt(0);

	        double result;
	        boolean isIntegerResult = false;

	       
	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Result: " + result);
	                isIntegerResult = (result == (int) result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Result: " + result);
	                isIntegerResult = (result == (int) result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Result: " + result);
	                isIntegerResult = (result == (int) result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Result: " + result);
	                    isIntegerResult = (result == (int) result);
	                } else {
	                    System.out.println("Error: Division by zero is not allowed.");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Invalid operator.");
	                return;
	        }

	      
	        if (isIntegerResult) {
	            int intResult = (int) result;
	            if (intResult % 2 == 0) {
	                System.out.println(intResult + " is even.");
	            } else {
	                System.out.println(intResult + " is odd.");
	            }
	        } else {
	            System.out.println("The result is not an integer, so it cannot be determined as even or odd.");
	        }

	        scanner.close();
	    }
	}





