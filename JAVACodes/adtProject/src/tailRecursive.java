
public class tailRecursive {
	public static void main(String a[]){
		
		tailRecursive t = new tailRecursive();
		t.prog(3);
		System.out.print("\n");
		t.prog01(3);
		System.out.print("\n");
		t.prog02(3);
	}
	
	public void prog(int i){
		if(i>0){
			prog(i-1);
			System.out.print(i+"  ");
			prog(i-1);
		}
	}
	public void prog01(int i){
		if(i>0){
		System.out.print(i+"  ");
		prog01(i-1);
	}}
	
	public void prog02(int i){
		if(i>0){
			prog02(i-1);
			System.out.print(i+"  ");
		}	}
	}
	
