package com.Test;

import java.util.Scanner;

public class program3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		generateSeries( n);
	}
static void generateSeries(int n) {
		
	    if(n%2==0) {
	    	n=n-1;
	    }
	    
		int number=1;	
		for(int i=0;i<n;i++) {
			System.out.print(number+" ");
			
			number=number+2;
		 
		}
}


}
