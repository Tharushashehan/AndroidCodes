/*8). It is decided to base the fine for speeding in a built up area as follows,
	50 pounds if speed is between 31 and 40 mph
	75 pounds if the speed is between 41 and 50 mph
	100 pounds if he speed is above 50 mph
		Write a java program to calculate the fine when the speed is given from the keyboard.
*/

import java.util. Scanner;

class fine{
	void fine(int x){
		if(x>50){
			System.out.println("Fine is 100 pounds");
		}
		else if(x>41){
			System.out.println("Fine is 75 pounds");
		}
		
		else if(x>31){
			System.out.println("Fine is 50 pounds");
		}
		else {
			System.out.println("invalid value");
		}
	}
}

class Question08{
	public static void main(String a[]){
		Scanner s = new Scanner(System.in);
		fine f = new fine();
		
		System.out.println("enter the speed value:");
		int x = s.nextInt();
		f.fine(x);
	}
}