 
public class adtCreateClient {
	public static void main(String a[]){
		
		adtCreate<String> adtCreate = new adtCreate("hello");
		System.out.print(adtCreate.getFirst());
		
		adtCreate<Integer> adtCreateInteger = new adtCreate(2016);
		System.out.print("  "+adtCreateInteger.getFirst());
		
	}
}
