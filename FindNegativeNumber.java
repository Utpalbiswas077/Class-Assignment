package Opp.Arry;


public class FindNegativeNumber {

	public static void main(String[] args) {
			int j = 0;
			int[] Neg_arr = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};
			
			
			System.out.println("\nList of Negative Numbers in NEG Array : ");
			while(j < Neg_arr.length) 
			{
				if(Neg_arr[j] < 0) {
					System.out.println( Neg_arr[j]);
				}
				j++;
			}
		}
	}