package program2;

public class Matrix {
	public static void main(String args[]) {
		// declaring and initializing 2D array
		int [][] arr1={ { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };
		int [][] arr2={ { 5, 5, 5 }, { 6, 6, 6 }, { 7, 7, 7 } };
		
		// declaring and memory allocating 2D array
				int [][] arr3=new int [3][3];
				
		//Calling add method...
				add(arr1,arr2,arr3);
			
		//calling print method
				print(arr3);
				
	}
	
	//method to add the two matrices and store value in 3rd matrices.....
	public static void add(int arr1[][], int arr2[][], int arr3[][]) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
				
			}
		}
	}
	
	// method to print the value of matrices......
	public static void print(int arr[][]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
		
		System.out.println();
		}
	}


}
