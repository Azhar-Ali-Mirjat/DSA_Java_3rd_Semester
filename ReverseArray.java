
//Given an array (or string), the task is to reverse the array/string.

public class ReverseArray {
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
		int array[]= {1,2,3};
		
		int start=0;
		int end =array.length-1;
		int temp;
		
		System.out.print("Array Before Reversing: ");
		printArray(array);

		temp=array[start];
		array[start]=array[end];
		array[end]=temp;
		System.out.print("\nArray After  Reversing: ");
		printArray(array);
	}

}
