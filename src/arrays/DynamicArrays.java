package arrays;

public class DynamicArrays {
	int[] arr;
	int length = 0;

	public DynamicArrays() {
		this.arr = new int[2];
		this.length = 0;
	}

	public void insertEnd(int n) {
		if (length == arr.length) {
			resizeArr();
		}
		arr[length] = n;
		length++;
	}

	public void removeEnd() {
		if (length > 0) {
			arr[length - 1] = 0;
			length--;
		}
	}

	public void insertAtIndex(int pos, int n) {
		if(pos < 0 || pos > length){
			return;
		}
		if (arr.length == length) {
			resizeArr();
		}
		for (int i = length - 1; i >= pos; i--) {
			arr[i + 1] = arr[i];
		}
		arr[pos] = n;
		length++;
	}

	public void removeAtIndex(int pos) {
		if (pos < 0 || pos >= length) {
			return;
		}
		for (int i = pos + 1; i < length; i++) {
			arr[i - 1] = arr[i];
		}
		length--;
		arr[length]=0;
	}

	public void resizeArr() {
		int[] newArr = new int[arr.length * 2];
		for (int i = 0; i < length; i++) {
			newArr[i] = arr[i];
		}
		arr = newArr;
	}

	public void printArr() {
		if (length > 0) {
			for (int i = 0; i < length; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}

}
