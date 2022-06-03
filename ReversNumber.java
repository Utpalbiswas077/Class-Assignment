package Basicprogram;

import java.util.Scanner;

public class ReversNumber {
	
	
	public int Revers(int n)//method for severs
	{
		int r=0,rem,temp;
	while(n>0)
	{
		rem=n%10; //calculate revers number
	r=r*10+rem;   
	n=n/10;
	}
	return r; //return the value to r
	}
	public void Palindrome(int temp,int r) //method for palindrome
	{
		if(temp==r)
		{
			System.out.println("the number is palindrom");
	}
	else {
		System.out.println("the number is not palindrom");
	}
	}
	public static void main(String[] args)
	{
		int i,r,temp;
		Scanner sc=new Scanner(System.in);//create a scanner object
		System.out.println("enter number");
		i=sc.nextInt();//get input from user 
		temp=i;//storing the value for future use
		ReversNumber fd=new ReversNumber();
		r=fd.Revers(i);//method call
		System.out.println("reverse of "+temp+" is: "+r);//call the function to find the revers number
		//check palindrome
		fd.Palindrome(temp,r);
	}

}
