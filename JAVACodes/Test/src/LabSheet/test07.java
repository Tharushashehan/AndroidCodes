package LabSheet;

class test07{
	int i;
	int j;
	static int sum;
	test07(){
		i = 10;
		j = 20;
		System.out.println("Inside Constructor:i+j = "+(i+j));
	}
	public int display(){
		int k = 30;
		System.out.println("Inside display Method:i+j = "+(i+j));
		sum = i+j+k;
		return sum;
	}
	public static void main(String args[]){
		test07 d = new test07();
		d.display();
		System.out.println("Inside main Method:= "+ sum);
		
		int a = 2; 
		int b = 3; 
		int max = findMax(a,b); 
		System.out.println("The maximun between " + a + " and " + b + " is: " + max);
	}
		/*public*/ static int findMax(int x, int y){ 
			int result; 
			if (x > y) 
				result = x; 
			else 
				result = y; 
			
			return result; 
			} 
		
}
