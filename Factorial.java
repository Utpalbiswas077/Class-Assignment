package Basicprogram;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in); //create a scanner object
	System.out.println("Enter a number for find factorial");
	int num=sc.nextInt();//get input from user 

	System.out.print("Factorial of the "+num+"is "+factorial(num));
	//call the function to find factorial


	}

	static int factorial(int num)
	{
	int i,fact=1;
	for(i=1; i<=num; i++){
	fact=fact*i;//calculate the factorial using for loop

	}
	return fact;

	}
	}

