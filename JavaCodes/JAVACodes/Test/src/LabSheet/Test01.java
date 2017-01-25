package LabSheet;

import java.util.Scanner;

public class Test01 {

	public static void main(String a[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an integer");
		int i = s.nextInt();
		
		if(i%2==1)
			System.out.println("odd number");
		else if(i==0)
			System.out.println("number is zero");
		else
			System.out.println("even number");
		
		
	}
}
