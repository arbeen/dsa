package arrays;

public class Arrays{
    public static void main(String[] args){
		StaticArrays sarr = new StaticArrays(5);
		sarr.insertEnd(1);
		sarr.insertAtIndex(4, 4);
		sarr.printArr();
		int[] newArr = {1,2};
		DynamicArrays darr = new DynamicArrays(newArr, 2);
		darr.printArr();
		darr.insertEnd(3);
		darr.printArr();
    }
}
