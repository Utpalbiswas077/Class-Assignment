package Basicprogram;

import java.util.Scanner;

public class Fibonacci 
{ //create a class for fibonacci serise
public static void main(String[] args)
{
	int n,i,a=0,b=0,c=1;// declear varaibale
	Scanner sc=new Scanner (System.in);// Create Scanner class
	System.out.println("Enter value of n: ");
	n=sc.nextInt();// gitting input from user
	System.out.println("first " + n +" of fibonnaci serise:" );
	//print the fibonacci serise
for(i=1;i<=n;i++) //starting a loop from 0 to n number
{
	a=b;      //store a value in to b 
	b=c;     //store b value in to c
	c=a+b;   //

System.out.print( a +" ");	//print only the "a" 	
}
}
}
