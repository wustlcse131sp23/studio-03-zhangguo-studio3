package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner (System.in);
		System.out.println("Please enter a number of n");
		int n=in.nextInt();
		int[]dataSet= new int [n];
		for (int factor=2;factor<dataSet.length/2;factor++) 
		{
			for (int multiple=factor*2;multiple<dataSet.length;multiple=multiple+factor)
			{
//				System.out.println(dataSet[factor]);
				dataSet[multiple]=1;
			}
			System.out.println(dataSet[factor]!=1);
		}
		}
	}


