package arrays;

public class StaticArrays {
	private int[] arr;
	private int capacity;
	private int length;

	StaticArrays(int capacity){
		this.capacity = capacity;
		this.arr = new int[capacity];
		this.length = 0;
	}

	public int[] insertEnd(int n) {
		if (length < capacity) {
			arr[length] = n;
			length++;
		}
		return arr;
	}

	public int[] removeEnd() {
		if (length > 0) {
			arr[length - 1] = 0;
			length--;
		}
		return arr;
	}

	public void insertAtIndex(int n, int pos) {
		if (length < capacity && pos < capacity && pos >= 0) {
			for (int i = length - 1; i >= pos; i--) {
				arr[i + 1] = arr[i];
			}
			arr[pos] = n;
			length++;
		}
	}

	public void removeAtIndex(int pos) {
		if (length > 0 && pos >= 0 && pos < length) {
			for (int i = pos + 1; i < length; i++) {
				arr[i - 1] = arr[i];
			}
			arr[length - 1] = 0;
			length--;
		}
	}

	public void printArr() {
		if (length > 0) {
			for (int i = 0; i < capacity; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

}
