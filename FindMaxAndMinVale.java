package Opp.Arry;

import java.util.Scanner;

public class FindMaxAndMinVale {
	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
    System.out.println(" enter elements in arry");
    
    
    int min =a[0];
    int max=a[0];
    for(int i=0;i<=4;i++)
    {
      a[i]=sc.nextInt();
     
      if(a[i]>max)
      {
        max=a[i];
       
      }
      if(a[i]<min)
      {
      min=a[i];
      }
    }
    System.out.println("Maximum element is "+max);
    System.out.println("Minimum element is "+min);
    
    
}
}

