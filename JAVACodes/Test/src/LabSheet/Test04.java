
	package LabSheet;

	import java.util.Vector;
	
public class Test04 {
	public static void main(String args[]) {
		Vector v = new Vector();
		Vector v1 = new Vector();
		
		for (int i = 0; i < 10; i++){
			//String s=String.valueOf(i);
			v.addElement(i+"");
			v1.addElement(String.valueOf(i));
		}
		
		System.out.println("Starting Size = " + v.size());
		System.out.print("Set of Elements:");
		
		for (int i = 0; i < 10; i++){
			System.out.print(v.get(i));
			System.out.print(v1.get(i));
			System.out.print(" ");
		}
		System.out.print("\nInserting an element ...");
		v.insertElementAt("~(Newly Inserted Element)~",5);
		System.out.print("\nNew Set of Elements:");
		
		for (int i = 0; i < v.size(); i++)
			System.out.print(v.get(i));
		
		System.out.println("\nCurrent Size = " + v.size());
		System.out.print("\nRemoving the inserted element ...");
		v.removeElementAt(5);
		System.out.print("\nNew Set of Elements:");
		
		for (int i = 0; i < v.size(); i++)
			System.out.print(v.get(i));
		
		System.out.println("\nCurrent Size = " + v.size());

	}

}


