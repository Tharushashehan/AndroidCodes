/*6). Write a java program to display the name of the day in a week, depending on the number
entered through the keyboard. Ex: 1- Monday 2- Tuesday
*/

import java.util.Scanner;

class day{
	void day(int x){
		switch(x){
			case(1): System.out.println("Monday");
			break;
			case(2): System.out.println("Tuesday");
			break;
			case(3): System.out.println("Wednesay");
			break;
			case(4): System.out.println("Thursday");
			break;
			case(5): System.out.println("Friday");
			break;
			case(6): System.out.println("Saturday");
			break;
			case(7): System.out.println("Sunday");
			
			default: System.out.println("the value you entered is invalid");
		}
	}
}

class Question05{
	public static void main(String a[]){
		Scanner s = new Scanner(System.in);
		day d = new day();
		
		System.out.println("enter the number belongs to the day");
		int x = s.nextInt();
		d.day(x);
	}
}