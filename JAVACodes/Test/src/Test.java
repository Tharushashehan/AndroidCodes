
public class Test {
	public static void main(String a[]){
		System.out.println("hello world");
		
		for(int x=0;x<5;x++){
			for(int y=0;y<x;y++){
			
			System.out.print("*");
				
				}
			System.out.println(" ");
			
		}
		
		for(int x=0;x<5;x++){
				for(int y=5;y>x;y--){
					System.out.print(" ");
				}	
			for(int y=0;y<x;y++){
				System.out.print("*");
					}
			System.out.println(" ");
		}
		
		
		for(int x=1;x<10;x=x+2){
			for(int y=10;y>x;y=y-2){
				System.out.print(" ");
					}
			
			for(int y=0;y<x;y++){
				System.out.print("*");
					}
			
			for(int y=10;y>x;y=y-2){
				System.out.print(" ");
					}
			System.out.println(" ");
		}
			System.out.println(" ");
		}
		
	}


