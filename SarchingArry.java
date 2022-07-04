package Opp.Arry;

import java.util.Scanner;

public class SarchingArry 
	 
	{  
	 public static void main(String args[])
	 {
	 Scanner sc = new Scanner(System.in); // create scanner class
	 
	     int i,n,search,temp=0; // declaration of var
	     
	 System.out.println("Enter the number of elements:") ;
	 n = sc.nextInt(); // geting input from user
	 int a[] = new int[n];
	 
	     System.out.println("Enter the elements") ;
	     for(i=0;i<n;i++)
	     {
	         a[i] = sc.nextInt();
	     } //end loop fror printing arry elements
	 
	 System.out.println("Enter the element to be seached");
	 search = sc.nextInt();
	    
	     /*Perform search operation*/
	     for(i=0;i<n;i++)
	     {
	         if(a[i]==search)
	         {
	             System.out.println("Element "+search+" found at "+i+" position");
	             temp=1;  // if find the element on arry then temp=1
	              break;  //break the loop, dont need to check any more
	         }
	     }
	     
	     if(temp==0)
	     {
	         System.out.println("Element "+search+" not found");
	     }
	     
	 }
}

