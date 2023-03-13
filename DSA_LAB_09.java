class Array_Stack<R>{
	R array[];
	int size;
	
	public Array_Stack(int n) {
		array = (R[]) new Object[n];
		size=0;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void push(R n) {
		array[size]=n;
		size++;
		System.out.println("Added element is: "+n);
	}
	
	public R peek() {
		if (size==0) {
			return null;
		}
		
		return array[size-1];

	}
	
	public R pop() {
		R temp = array[size-1];
		array[size-1]=null;
		size--;
		return temp;
	}
	
	public void display() {
		System.out.println("Elements Of List Are;");
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
public class DSA_LAB_09 {
	public static void main(String[] args) {
		Array_Stack array_Stack= new Array_Stack(2);
		System.out.println("Pushing Elements");
		array_Stack.push("Azhar");
		array_Stack.push("21SW087");
		
		System.out.println("Peek Element is : "+array_Stack.peek());
		
		array_Stack.display();
		
	}
}
 