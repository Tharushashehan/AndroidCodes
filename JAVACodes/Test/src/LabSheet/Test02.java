
package LabSheet;

public class Test02 {
	public static void main(String a[]){
		int num[] = {10,5,7,4,3};
		System.out.print(num.length+" ");
		System.out.print("the int array: ");
		for(int i=0;i<num.length;i++){
			System.out.print(" "+num[i]);
		}
	char ch[]={'a','e','i','o','u'};
	System.out.print("\n"+ch.length+" ");
	System.out.print("the char array: ");
	for(int i=0;i<ch.length;i++){
		System.out.print(" "+ch[i]);
	}
	String st[]={"good","monin","mala","dat","maddada","kamala"};
	System.out.print("\n"+st.length+" ");
	System.out.print("the String array: ");
	for(int i=0;i<st.length;i++){
		System.out.print(" "+st[i]);
	}
	int x[]=new int[100];
	for(int i=0;i<100;i++){
		x[i]=i+1;
	}
	System.out.print("\nthe no list:");
	int sum=0;
	for(int i=0;i<100;i++){
		sum=sum+x[i];
		System.out.print(x[i]+" ");
	}
	System.out.print("\nthe total is:"+sum);
	
	/*two dimentional array*/
	int y[][]=new int[2][3];
	System.out.println(" ");
	y[][]={{1,2,3},{4,5,6}};
	for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
			System.out.print(y[i][j]);
		}
	}
	}

}
