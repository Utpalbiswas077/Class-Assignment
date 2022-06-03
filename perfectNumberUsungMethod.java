package Basicprogram;

import java.util.Scanner;

public class perfectNumberUsungMethod {
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);//creat scanner class
		System.out.println("Enter Any Number: ");
		num=sc.nextInt();
		perfectNumberUsungMethod obj=new perfectNumberUsungMethod();
		obj.perfectnumber(num);//obj call
	}
public  void perfectnumber(int num)
{
	int i,sum=0;
	for(i=1;i<num;i++)

		if(num%i==0) 
		{
	       sum=sum+i; //calculate perfect number// sum+=1//short hand operater
	}
		if(sum==num)
		{
			System.out.println("The Number " + num +" is perfect number");
			}

	   else 
	   {
		   System.out.println("The Number "+ num +" is not perfect number");
		  
	}
	}
}

