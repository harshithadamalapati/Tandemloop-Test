package com.Test;

import java.util.Scanner;



public class program1 {
	  static double calculator(double a, double b, String operation) {
		     switch (operation.toLowerCase()) {
		         case "add":
		             return a + b;
		         case "subtract":
		             return a - b;
		         case "multiply":
		             return a * b;
		         case "divide":
		        	 if (b == 0) {
		                    throw new ArithmeticException("Division by zero is not allowed.");
		                }
		                return a / b;
		            default:
		                throw new IllegalArgumentException("Invalid operation");
		        }

		            
		                 
		 }

		 public static void main(String[] args) {
		     Scanner sc = new Scanner(System.in);
		     try {
		     System.out.print("Enter operation (add, subtract, multiply, divide): ");
		     String operation = sc.nextLine();
		     System.out.print("Enter a: ");
		     double a = sc.nextDouble();
		     System.out.print("Enter b: ");
		     double b = sc.nextDouble(); 
		     sc.nextLine();   
		     double result=calculator(a, b, operation);
	            System.out.println("Result: " + result);
	        } 
		 catch (IllegalArgumentException | ArithmeticException e)
		 {
	            System.out.println("Error: " + e.getMessage());
	        } 
		 finally {
	            sc.close();  
	        }
	    }
		     
		     
		     
		 }
		
	



	


		
	
	





