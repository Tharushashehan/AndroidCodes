import java.util.Scanner;

class calculator{
	void add(double x, double y){
		System.out.println("answer is="+(x+y));
	}
	
	void reduce(double x, double y){
		System.out.println("answer is"+(x-y));
	}
	
	void multiple(double x, double y){
		System.out.println("answer is="+(x*y));
	}
	
	void devide(double x, double y){
		System.out.println("answer is="+(x/y));
	}
}

class test4{
	public static void main(String args[]){
		
		Scanner s = new Scanner(System.in);
		calculator c = new calculator();
		
		System.out.println("enter first no:");
		double x = s.nextDouble();
		
		System.out.println("enter second no:");
		double y = s.nextDouble();
		
		System.out.println(" for add:\t 1 \n for reduce:\t 2 \n for devide:\t 3 \n for multiple:\t 4 ");
		
		System.out.println("enter the calculation you want to make:");
		
		int z = s.nextInt();
		
		switch(z){
			case(1):		
				c.add(x,y);
			
			case(2):
				c.reduce(x,y);
				
			case(3):
				c.devide(x,y);
				
			case(4):
				c.multiple(x,y);
				}
	}
}