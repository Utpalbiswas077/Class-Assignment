package Basicprogram;

import java.util.Scanner;

public class PerfectNumber {

public static void main(String[] args)
{
int n,num=0,i;
Scanner sc=new Scanner(System.in);//create a scanner sclass
System.out.println("Enter number: ");

n=sc.nextInt();//geting input from users
for(i=1;i<n;i++)

	if(n%i==0) 
	{
       num=num+i; //calculate perfect number
}
	if(num==n)
	{
		System.out.println("The Number " + n +" is perfect number");
		}

   else 
   {
	   System.out.println("The Number "+ n +" is not perfect number");
	  
}
}
}
