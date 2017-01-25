/*7). Write a java program to find out that the number entered is divisible by the second
number entered or not.
*/

import java.util.Scanner;

class divide{
	void divide(int x, int y){
		if(x%y==0){
			System.out.println("the fist number is divisible by the second");
			
		}
		
		else{
			System.out.println("the fist number is not divisible by the second");
		}
	}
}

class Question07{
	public static void main(String a[]){
		Scanner s= new Scanner(System.in);
		divide d = new divide();
		
		System.out.println("Enter first no:");
		int x = s.nextInt();
		System.out.println("Enter second no:");
		int y = s.nextInt();
		d.divide(x,y);
		
	}
}