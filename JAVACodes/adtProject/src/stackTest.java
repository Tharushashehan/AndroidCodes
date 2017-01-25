
public class stackTest {
		private int capacity;
		private double[] stackArray;
		private int top;
		
		public stackTest(int s){ //constructor
		capacity = s;
		stackArray= new double[capacity]; //create array
		top = -1;
		}
		
		public void push(double j){
		stackArray[++top] = j;
		}
		
	

	public double pop() {
		return stackArray[top--];
		}
		
		public double peek() {
		return stackArray[top];
		}
		
		public boolean isEmpty(){
		return (top==-1);
		}
		}