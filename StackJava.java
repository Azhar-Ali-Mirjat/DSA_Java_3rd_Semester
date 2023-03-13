import java.util.Arrays;

class ArrayStack{
	Object [] array;
	Object [] arr;
	int size;
	public ArrayStack(int sizeOfArray) {
	array=new Object[sizeOfArray];
	size=0;
	}

	public void peek(){
	if(size!=0) {
		System.out.println("Element at top is : "+array[size-1]);
	}	
	else {
		System.out.println("Empty Stack");
	}
	}
	
	public void pop() {
		if(size!=0) {
			Object object = array[size-1];
			array[--size] = null;
			System.out.println("Deleted  : "+object);
		}
		else {
			
			System.out.println("Can't Delete b/c Array is Empty");
		}
	}
	
	public void push(Object obj) {
		array[size++]=obj;
		System.out.println("Inserted : "+obj);
		
	}
	
	public int size() {
		return size;	
	}
	
	public String toString() {
	if(size!=0) {	
		String t="[";
		for(int i=0;i<size;i++) {
			if(i<size-1)
			t+=array[i]+", ";
			else {
				t+=array[i]+" ";
			}
		}
		t+="]";
		return t;
	}
	return (Arrays.toString(array));
	}
	
	public void isEmpty() {
		if (size==0) {
			System.out.println("Empty");
			
		}
		else {
			System.out.println("Array has Some Elements ");
		}
		
	}
	public void FirstElement() {
		System.out.println("Element to be deleted is : "+array[0]);
		for (int i = 0; i <size-1; i++) {
			array[i]=array[i+1];
			
		}
		--size;
		System.out.print("New Array is : ");
		for (int i = 0; i < size; i++) {
			System.out.print(array[i]+" ");
			
		}
	}
	
//	public void reverseStack() {
//		int[] reverseArray = new int[size];
//	      for(int i=0; i<size; i++) {
//	         reverseArray[i] = reverseArray.length;
//	      }
//	      System.out.println("Reversed array is ::"+Arrays.toString(reverseArray));
//		
//	}
//	
	
}

public class StackJava { 
	public static void main(String[] args) {
		ArrayStack  arrayStack = new ArrayStack(5);
		arrayStack.push(12);
		arrayStack.push(14);
		arrayStack.push(16);
		arrayStack.push(18);
		arrayStack.push(20);
		
		
//		arrayStack.pop();
//		arrayStack.peek();
		
		arrayStack.FirstElement();
		System.out.println("\nNew Array : "+arrayStack.toString());
			
		
	}

}