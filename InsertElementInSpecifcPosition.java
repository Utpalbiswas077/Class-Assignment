package Opp.Arry;

import java.util.Scanner;


public class InsertElementInSpecifcPosition {
	public static void main(String[] args) 
	{ 
		int size,pos,i,num; int arr[]=new int[10]; 
		Scanner sc=new Scanner(System.in);//  
		
		System.out.println("enter how many elements ypu want in an array!");
		size=sc.nextInt(); //5
		System.out.println("Enter "+size + "elements in an array"); 
		for(i=0;i<size;i++)
		
		{ 
			arr[i]=sc.nextInt();
			}
		System.out.println("enter position:");
		pos=sc.nextInt(); 
		//3 //check position is valid or not
		if(pos>size+1 || pos<0)
		{ 

			System.out.println("\nour size is :"+size+" please choose position according to size"); 
			} else { System.out.println("enter value:");
			num=sc.nextInt(); 
			//shifting the elements 
			for(i=size;i>=pos;i--)
			{ 
				arr[i]=arr[i-1];
				} //insert in position 
			arr[pos-1]=num; 
			//increasing the size from 5 to 6 size++; //new array 
			System.out.println("After adding new value,new array will be: ");
			for(i=0;i<size;i++) { System.out.println(arr[i]);
			} 
			} 
		} 
		}
	
