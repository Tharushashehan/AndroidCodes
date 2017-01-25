
public class Test3 {

	public static void main(String a[]){
		
			int i=1;
			
		for(int x=1;x<10;x=x+2){
			for(int y=10;y>x;y=y-2){
				System.out.print(" ");
					}
					for(int z=i;z>1;z--){
						System.out.print(z);	
					}
					for(int z=0;z<i;z++){
						System.out.print(z+1);	
					}
			System.out.println(" ");
				i++;
		}
	}
}
