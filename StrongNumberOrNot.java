//Program in java to check if given number is strong or not
package Basicprogram;

import java.util.Scanner;

public class StrongNumberOrNot {

	public static void main(String[] args)
	{
		int i,n,temp,rem,sum=0,fact; // 
		Scanner sc=new Scanner(System.in); // create scanner class
		System.out.println("Please Enter Any Number: ");
		n=sc.nextInt(); // geting input from user
		temp=n; // holding the input 
		
		while(n>0)
		{
			rem=n%10;
			fact=1;
			for(i=1;i<=rem;i++)// calculate factorial
			{
				fact=fact*i;
	}
		sum=sum+fact;
		n=n/10;
		}
	if(sum==temp)// 
		System.out.println("the number is strong: ");
	else
		System.out.println("the number is not strong: ");

}
}
