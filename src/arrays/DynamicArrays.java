package arrays;

public class DynamicArrays{
	int[] arr;
	int capacity = 2;
	int length = 0;
	public DynamicArrays(int[] arr, int capacity){
		this.arr = arr;
		this.length = arr.length;
		this.capacity = capacity;
	}
	public void insertEnd(int n){
		if(length <= capacity){
			resizeArr();
		}
		arr[length] = n;
	}

	public void resizeArr(){
		capacity = capacity * 2;
		int[] newArr = new int[capacity];
		for(int i = 0; i < length; i++){
			newArr[i] = arr[i];
		}
		arr = newArr;
	}
	public void printArr(){
		if(length > 0){
			for(int i = 0; i < capacity; i++){
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}


}
