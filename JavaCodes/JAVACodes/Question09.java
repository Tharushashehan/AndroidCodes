/*
9). National book center decides to give a discount for their customers. 
The discount of 25% is given to the customer if purchase amount exceeds 6000 and 20% given if not. 
Write a java program to print the amount customer need to pay when they input the purchase amount.
*/

import java.util.Scanner;
class discount{
	void discount(int x){
		if(x>6000){
			double y=0;
			y= (x*3)/4;
			System.out.println("Customer is given 25% discount");
			System.out.println("the value to pay:"+y);
		}
		else{
			double y=0;
			y= (x*8)/10;
			System.out.println("Customer is given 20% discount");
			System.out.println("the value to pay:"+y);
		}
	}
}

class Question09{
	public static void main(String a[]){
		Scanner s = new Scanner(System.in);
		discount d = new discount();
		
		System.out.println("Enter the purchase amount:");
		int x = s.nextInt();
		d.discount(x);
	}
}