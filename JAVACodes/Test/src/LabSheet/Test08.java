package LabSheet;

class Triangle{ 
	int base,height; 
	void pass(int base,int height){ 
		this.base=base;
		this.height=height;
				
		} 
	int area(){ 
		return(base*height)/2; 
		} 
	} 
public class Test08{
	public static void main(String[] args){
		Triangle t=new Triangle(); 
		t.pass(2,3); 
		int area = t.area(); 
		System.out.println("The area of the triangle is : " + area);
		
			System.out.println("Divide by zero)" + 3/0);
		
			}
}
