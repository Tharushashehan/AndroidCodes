
public class bubbleSortTest {

	//create an intarray we want to sort using bubble sort algorithm
	
	int data[]=new int[]{15,9,25,5,50,34};
	
	private static void bubbleSort(int[] data) {
	
		int n = data.length;
		int temp = 0;
		for(int i=0; i<(n-2); i++){
			for(int j=(n-1); j >= (i+1); j--){
				if(data[j-1] > data[j]){
					
					//swap the elements
					
					temp = data[j-1];
					data[j-1] = data[j];
					data[j] = temp;

				}}}}
}
