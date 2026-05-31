package arrays;

public class Arrays{
    public static void main(String[] args){
		int[] newArr = {1,2};
		DynamicArrays darr = new DynamicArrays(newArr, 2);
		darr.printArr();
		darr.insertEnd(3);
		darr.printArr();
    }
}
