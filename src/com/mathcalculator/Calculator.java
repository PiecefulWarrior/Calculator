  package com.mathcalculator;

import java.util.Scanner;

public class Calculator {
	
	public int addition(int a, int b) {
		
		return a+b;
	}

	public int multiplication(int a, int b) {
		
		return a*b;
	}
	
	public int substraction(int a, int b) {
		
		return a-b;
		
	}
	
	public double division(double a,double b) {
		
		return a/b;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator calc  =  new Calculator();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
		System.out.println("Choose an operation from below");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for substraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		System.out.println("Press 5 for exit");
		choice = sc.nextInt();
		
		switch(choice) {
		
		
		case 1:System.out.println("You have chosen addition, enter two numbers for addition");
			  int a = sc.nextInt();
			  int b = sc.nextInt();
			  System.out.println("Addition is "+calc.addition(a, b));
			  break;
		
		case 2:System.out.println("You have chosen substraction, enter two numbers for substraction");
			  int c = sc.nextInt();
			  int d = sc.nextInt();
			  System.out.println("Substraction is "+calc.substraction(c,d));
			  break;
		case 3:
			System.out.println("You have chosen multiplication, enter two numbers for multiplication");
			  int p = sc.nextInt();
			  int q = sc.nextInt();
			  System.out.println("multiplication is "+calc.multiplication(p,q));
			  break;
		case 4:
			System.out.println("You have chosen division, enter two numbers for division");
			  double x = sc.nextDouble();
			  double y = sc.nextDouble();
			  System.out.println("Division is "+calc.division(x,y));
			  break;
		case 5:
			System.out.println("You have chosen to exit, calcultor is getting off");
			break;
		default: System.out.println("You have given the wrong input");	
		break;
		}
		
		
		}while(choice!=5);
		
		
		
		
		
	}

}
