import java.util.Scanner; 

public class BubbleSortJava {

	
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		//get array from user
		System.out.println("How many numbers are you adding to the list? "); 
		int length = keyboard.nextInt(); 
		
		Integer [] userNumbers = new Integer[length];
		
		for (int i =0; i< length; i++) {
				System.out.println("Enter number #" + (i+1)); 
				userNumbers[i] = keyboard.nextInt(); 
		}
		//print array before sort
		System.out.println("Unsorted Array:"); 
		printArray(userNumbers); 
		//create object for bubble sort
		BubbleSortJava bb = new BubbleSortJava(); 
		
		//bubble sort the array
		bb.bubbleSort(userNumbers); 
		//print sorted array
		System.out.println("\nSorted Array:"); 
		keyboard.close();
		printArray(userNumbers); 
	}
		
		//use quicksort to sort them from high to low
		
		
		private static void printArray(Integer [] array) {
			//loop around array to print elements
		for (int i: array) {
			System.out.print(i + " "); 
			}
		}
		
		private static void bubbleSort(Integer []array) {
			//this is the bubble sort algo
			//select elements, swap if necessary to make from least to greatest
			int n = array.length; 
			for (int i=0; i< n-1; i++) {
				for(int j=0; j<n-i-1; j++) {
					if(array[j] > array[j+1]) {
						//swap places
						int temp = array[j]; 
						array[j] = array[j+1]; 
						array[j+1] = temp; 
					}
				}
			}
		}
		
	
		
		
	
}
