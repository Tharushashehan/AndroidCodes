
public class Test4 {

	public static void main(String a[]){
		hello h = new hello();
		hello h2 = new hello();
		
		System.out.println(h=h2);
		h.m();
		h2.m();
	}
}

class hello{
	void m(){
		System.out.println("hello world");
		System.out.println(squareNum(2));
	}
}