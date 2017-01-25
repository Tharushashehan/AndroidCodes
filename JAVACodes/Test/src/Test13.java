
import java.text.DecimalFormat;

public class Test13 {

	public static void main(String args[]) {

		float n = 1234.567F;
		DecimalFormat formatter = new DecimalFormat("####");
		System.out.println("Formatted Value is:"+formatter.format(n));
		DecimalFormat formatter1 = new DecimalFormat("#.0000");
		System.out.println("Formatted Value is:"+formatter1.format(n));
		DecimalFormat formatter2 = new DecimalFormat("00000.##");
		System.out.println("Formatted Value is:"+formatter2.format(n));
		DecimalFormat formatter3 = new DecimalFormat("0.##E0");
		System.out.println("Formatted Value is:"+formatter3.format(n));
		DecimalFormat formatter4 = new DecimalFormat("Rs ##.##");
		System.out.println("Formatted Value is:"+formatter4.format(n));
	}
}