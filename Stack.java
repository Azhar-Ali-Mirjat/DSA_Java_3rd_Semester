
class NewStack {
   public int size;           // size of the stack
   public int[] intArray;     // stack storage
   public int top; 
   public int[] intArray2;     // stack storage
// top of the stack

   // Constructor 
   public NewStack(int size){
      this.size = size;           
      intArray = new int[size];   //initialize array
      top = -1;                   //stack is initially empty
   }

   // Operation : Push
   // push item on the top of the stack 
   public void push(int data) {

      if(!isFull()){
         // increment top by 1 and insert data 
         intArray[++top] = data;
      }else{
         System.out.println("Cannot Add Data, Stack is full.");
      }      
   }

   // Operation : Pop
   // pop item from the top of the stack 
   public int pop() {
      //retrieve data and decrement the top by 1
      return intArray[top--];        
   }

   // Operation : Peek
   // view the data at top of the stack    
   public void peek() {       
	   if (isEmpty()) {
		  System.out.println("List is Empty");
		   
	}
      //retrieve data from the top
     else {
		System.out.println("Element on top  is : "+intArray[top]);
	}
   }

   // Operation : isFull
   // return true if stack is full 
   public boolean isFull(){
      return (top == size-1);
   }
   
   // Operation : isEmpty
   // return true if stack is empty 
   public boolean isEmpty(){
      return (top == -1);
   }
   
   public void lastElement() {
	   for(int i=top; i>0; i--) {
		   pop();
		   
	   }
	   
	
   }
    
}

public class Stack{
	public static void main(String[] args) {
		NewStack stack = new NewStack(5);
		
		stack.push(22);
		stack.peek();
		
		System.out.println("Element deleted is : "+stack.pop());
		stack.peek();
		System.out.println("Element deleted is : "+stack.pop());

		
	}
}


