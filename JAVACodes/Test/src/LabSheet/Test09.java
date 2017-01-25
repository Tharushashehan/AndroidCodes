package LabSheet;

import java.util.Scanner;
class Test09{
	public static void main (String[] args) {
		
		
			for (char ch = 'A'; ch <='Z'; ch++) {
			System.out.print(ch + " ");
			}
			System.out.println(" ");
			
			for (int i = 1, j= 5; i <=j; i++,j--) {
				System.out.println("Loop - " +i + ": i=" +i + " j = " + j );
				}
			for (int i = 1; i <=10; i++) {
				System.out.println("Loop - " +i);
				if (i==5) {
				break;
				}
				int i1=1,x=0;
				while (i1 <=5) {
					x++;
					System.out.println("x = " +(x));
					if (x < 5) {
					continue;
					}
					System.out.println("i = " +(i1));
					i1++;
					}
			}
				int i11=1, x1=0, j;
				LOOP: for (j=1; j < 3; j++){
					System.out.println("j = " +(j));
					while (i11 <=5) {
						x1++;
					System.out.println("x = " +(x1));
					if (x1 < 5) {
						continue;
					}
					if (x1 ==9) {
						continue LOOP;
					}
					System.out.println("i = " +(i11));
					i11++;
				}
				
		Scanner scan = new Scanner (System.in);
		System.out.print ("Enter day of the week : ");
		int day = scan.nextInt();
		switch (day){
		case 1:
			System.out.println("Today is Sunday");
			break;
		case 2:
			System.out.println("Today is Monday");
			break;
		case 3:	
			System.out.println("Today is Tuesday");
			break;	
		case 4:
			System.out.println("Today is Wednesday");
			break;
		case 5:
			System.out.println("Today is Thursday");
			break;
		case 6:
			System.out.println("Today is Friday");
			break;
		case 7:
			System.out.println("Today is Saturday");
			break;
		default :
			System.out.println("Wrong entry!");
		}
	}
}}