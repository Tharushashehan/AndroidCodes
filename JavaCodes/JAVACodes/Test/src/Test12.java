class Test12 {
public static void main (String[] args) {

	int n = 2;
	float x = 1234567.34567F;

System.out.format("%3d\n", n);
System.out.printf("%3d\n", n);
System.out.printf("%+d\n", n);
System.out.printf("%05d\n", n);
System.out.printf("%.2f\n", x);
System.out.printf("%,.2f\n", x); // Group Seprators
System.out.printf("%e\n", x);
System.out.printf("%15s%15s%15s\n\n", "Item","Unit Price", "Quantity");
System.out.printf("%15s\n%15s\n%15s\n", "Item:","Unit Price:", "Quantity:");
System.out.printf("%c\n", 'a'+4);
System.out.printf("%d\n", 'a'+1);

}
}