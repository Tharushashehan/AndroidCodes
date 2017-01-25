/*
1). Write a java program to check whether a number entered by user is even or odd
*/

import java.util.Scanner;

class oddeven{
	void oddeven(int x){
		int y = x%2;
		
			if(x==0){
				System.out.println("the number you entered is zero");
			}
			
			else if(y==0){
				System.out.println("The number you entered is an even number");
			}
						
			else{
				System.out.println("The number you entered is an odd number");
			}
	}
}

class Question01{
	public static void main(String args[]){
			Scanner s = new Scanner(System.in);
			oddeven o = new oddeven();
			
			System.out.println("enter an integer number:");
			int x = s.nextInt();0
			o.oddeven(x);
	}
}