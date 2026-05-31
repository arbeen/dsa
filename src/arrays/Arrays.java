package arrays;

public class Arrays{
    public static void main(String[] args){
		StaticArrays sarr = new StaticArrays(5);
		sarr.insertEnd(1);
		sarr.insertAtIndex(4, 4);
		sarr.printArr();
		DynamicArrays darr = new DynamicArrays();
		darr.insertEnd(1);
		darr.insertEnd(2);
		darr.insertEnd(3);
		darr.insertAtIndex(2, 99);
		darr.printArr();
		darr.removeAtIndex(1);
		darr.printArr();
    }
}
