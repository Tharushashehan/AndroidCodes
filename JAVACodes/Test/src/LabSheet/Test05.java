package LabSheet;
// A Simple Constructor 
	class Construct { 
		void method(){
			System.out.println("Starts Constructing");
		}
		Construct() { 
			System.out.println("Finished Constructing"); 
			}
		} 
	public class Test05 { 
		public static void main(String[] args) { 
			// Object is being created & Java calls the Constructor 
			Construct c = new Construct(); 
			c.method();
			new Construct();
		} 
	}
