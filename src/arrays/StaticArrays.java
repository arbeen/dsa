package arrays;

public class StaticArrays{
	public static int[] insertEnd(int[] arr, int length, int capacity, int n){
		if(length<capacity){
			arr[length] = n;
		}
		return arr;
	}
	
	public static int[] removeEnd(int[] arr, int length){
		if(length>0){
			arr[length-1] = 0;
		}
		return arr;
	}
	public static void insertAtIndex(int[] arr, int length, int capacity, int n, int pos){
		if(length<capacity && pos<capacity && pos >= 0){
			for(int i = length-1; i>=pos; i--){
				arr[i+1] = arr[i];
			}
			arr[pos] = n;
		}
	}

	public static void removeAtIndex(int[] arr, int length, int pos){
		if(length>0 && pos>=0 && pos<length){
			for(int i = pos+1; i<length; i++){
				arr[i-1] = arr[i];
			}
			arr[length-1] = 0;
		}
	}
	public static void printArr(int[] arr, int length){
		if(length > 0){
			for(int i = 0; i<length; i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		int[] arr = new int[10];
		insertEnd(arr, 0, 10, 1);
		insertEnd(arr, 1, 10, 2);
		printArr(arr, 10);
		insertAtIndex(arr, 2, 10, 69, 0);
		printArr(arr, 10);
		removeAtIndex(arr, 3, 0);
		printArr(arr, 10);
	}
		
}

