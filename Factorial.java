package com;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] arg){
		int number;
		int factorial;
		Scanner input = new Scanner(System.in);
	System.out.println("enter a number to find factorial");
	number = input.nextInt();
	factorial = number;
	for(int i=(number -1);i>1; i--){
	factorial = factorial*i;
	}
	System.out.println("facorial of " +number +  "is" + factorial);
	}
		
}	


