/*
6). Write a java program to decide whether there is a gain or loss, when cost price(CP) and
selling price(SP) of items are given.
*/

import java.util.Scanner;

class gainloss{
	void gainloss(int cp, int sp){
	
		if(cp<sp){
		System.out.println("there is a gain");
		System.out.println("The gain is:"+(sp-cp));
		}
		
		else if(cp>sp){
		System.out.println("there is a loss");
		System.out.println("The loss is:"+(cp-sp));
		}
	}
}

class Question06{
	public static void main(String a[]){
		Scanner s = new Scanner(System.in);
		gainloss gl = new gainloss();
		
		System.out.println("Enter the cost price:");
		int x = s.nextInt();
		System.out.println("Enter the selling price:");
		int y = s.nextInt();
		
		gl.gainloss(x,y);
		
	}
}