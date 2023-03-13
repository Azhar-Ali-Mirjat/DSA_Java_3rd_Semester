import java.util.Arrays;

// ARRAYS
//Display a array
//Insert in array
//Update an array
//Delete an element in array
//Resize an array
//Binary search
//Linear search
//Selection sort
//Quick sort
//Insertion sort
//Bubble sort 
//How to copy an array
//How to reverse an array
//How to find median, last element of array

class ArrayMethods{
	int size=0;
	
	public int[] insertAtLast(int[] array , int data) {
		int[] arr = new int[array.length+1];

		for (int i = 0; i < array.length; i++) {
			arr[i]=array[i];
		}
		arr[arr.length]=data;
		return arr;
	}
	
	
	public int[] insert(int[] array , int data, int postion) {
		int[] arr = new int[array.length+1];

		for (int i = 0; i < array.length; i++) {
			
			arr[i]=array[i];
		}
		if (postion>=0 && postion<arr.length) {
			
		arr[postion]=data;
		}else {
			System.out.println("Invalid");
		}
		return arr;
	}
	
	public void update(int[] array, int data , int element) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]==data) {
				array[i]=element;
				
			}
			
		}
		
		
	}
	
	public void size(int[] array ) {
		for (int i = 0; i < array.length; i++) {
			size++;
		}
		
		System.out.println("Array Size is : "+size);
	}
	
	public void display(int[] array) {
		System.out.print("Array is : ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
			size++;
		
		}
		
		System.out.println();
	}
	
	public int[] delete(int[] array, int element) {
		int[] newArray= new int[array.length-1];
		int count=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]==element) {
				
				newArray[count]=array[++i];
				count++;
			
			}
			else {
				newArray[count]=array[i];
				count++;
			}
			
		}
				
		return newArray;
		
	}
	
	public int[] reSizedArray(int[] array, int index) {
		int[] arr =new int[array.length+index];
		
		for (int i = 0; i < array.length; i++) {
			arr[i]=array[i];
		}
		
		return arr;
	}
	
	public int linearSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++)if (array[i]==target) return i;
				return -1;	
	}
	
	public int binarySearch(int[] array, int target) {
		int last=array.length-1, first=0;
		int mid=0;
		while(first<last) {
			mid=(first+last)/2;
			if (array[mid]==target) {	
				return mid;
			}
			else if (array[mid]>target)
				last=mid-1;
			
		else {
				first=mid+1;
			}
	}
	return -1;
}
	
	public int[] copyOfArray(int[] array) {
		int[] ar=new int[array.length];
		System.arraycopy(array, 0, ar, 0, array.length);
		
		
		return array;
		
	}
		
		
		
	


}

public class Array {
	public static void main(String[] args) {
		int[] array= {12,13,14,15,16,17,18,19,20,21,22,33,44,55,66,77,88,99};
	ArrayMethods	 calling = new ArrayMethods();
		calling.size(array);
//		
//		calling.display(array);
//		array=calling.insertAtLast(array, 14);
//		
//		System.out.println();
//		calling.display(array);
//		
//		System.out.println();
//		calling.update(array, 22, 77);
//		calling.display(array);
//		
//		
//		array=calling.delete(array, 77);
//		calling.display(array);
//		
		array=calling.reSizedArray(array,5);
		calling.display(array);
//		
//		int k=calling.linearSearch(array, 44);
//		System.out.print("Element is At Index : "+k);
//		
//		System.out.println();
//
		int m=calling.binarySearch(array, 44);
		System.out.println(m);
		System.out.println();
		calling.update(array, 44, 101);
		calling.display(array);
		
		System.out.println();
		
		array= calling.insert(array, 111, 5);
		calling.display(array);
		System.out.println();
		
		calling.copyOfArray(array);
		System.out.println("Copy"+Arrays.toString(calling.copyOfArray(array)) );
	
		
		
	}

}
