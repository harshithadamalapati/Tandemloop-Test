package com.Test;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		generateSeries( n);
		

	}
static void generateSeries(int n) {
		
		int number=1;	
		for(int i=0;i<n;i++) {
			System.out.print(number+" ");
			
			number=number+2;
		 
		}
}
}