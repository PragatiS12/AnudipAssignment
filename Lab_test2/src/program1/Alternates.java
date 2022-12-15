package program1;

public class Alternates {
	// Main method......
		public static void main(String []Args) {
		// Declaring and initializing array......
		int arr1[]= {10,20,30,40,50,60,70};
		
		//Declaring and memory allocating to array.....
		int arr2[]=new int [arr1.length];
		
		//Calling method ....
		store(arr1,arr2);
		
		//print the sum of array and calling the print method directly....
		System.out.println("Total sum of array 2 is:"+ sum(arr2));
		
		}
		
		// Public method to store the value in array......
		public static void  store(int arr1[],int arr2[]) {
			int j=0;
			for(int i=0;i<arr1.length;i+=2) {
				arr2[j]=arr1[i];
				j++;
				
			}	
		}
		
		// Public method return the sum of array 
		public static int sum(int arr2[]) {
			int sum=0;
			for(int i=0;i<arr2.length;i++) {
				sum+=arr2[i];
			}
			return sum;
			
		}
		

}
