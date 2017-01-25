import java.util.Scanner;

class number{
	void number(int x){
		if(x==0){
		System.out.println("The number you entered is zero.");
		}
		
		else if(x>0){
		System.out.println("The number you entered is positive.");
		}
		
		else if(x<0){
		System.out.println("The number you entered is negative.");
		}
	}
}

class Question03{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		number n = new number();
		
		System.out.println("enter any negative or positive integer number:");
		int x = s.nextInt();
		n.number(x);
		
	}
}