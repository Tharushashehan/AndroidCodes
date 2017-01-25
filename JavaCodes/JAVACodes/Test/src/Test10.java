// Operator Demo 
public class Test10 { 
	public static void main(String args[]) { 
		int a = 1,b = 2,c = 3, d; 
		a += 10; 
		b *= 5; 
		c += a++ * b--; 
		c %= 3; 
		d = --a + --b + ++c; 
		System.out.println("a = " + a); // 11 
		System.out.println("b = " + b); // 8 
		System.out.println("c = " + c); //3 
		System.out.println("d = " + d); //22 
		} 
	}