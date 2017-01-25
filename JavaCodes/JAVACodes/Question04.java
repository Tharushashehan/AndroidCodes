/*4). Write a java program to display the following grades for given marks.
Mark Grade
	100-90	 A
	89-80	 B
	79-70	 C
	<70 	 D
*/



import java.util.Scanner;

class grade{
	void grade(int x){
		if(x<70){
			System.out.println("Your grade is :- D");
		}
		
		else if(x<79){
			System.out.println("Your grade is :- C");
		}
		
		else if(x<89){
			System.out.println("Your grade is :- B");
		}
		
		else if(x<100){
			System.out.println("Your grade is :- A");
		}
		
		else{
			System.out.println("The value you entered is invalid.");
		}
	}
}

class Question04{
	public static void main(String a[]){
		Scanner s = new Scanner(System.in);
		grade g = new grade();
		
		System.out.println("Enter your integer mark value:");
		int x = s.nextInt();
		g.grade(x);
	}
}