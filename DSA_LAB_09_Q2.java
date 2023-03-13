class Node<R>{
	R data;
	public Node<R> nextNode;
	public Node(R n) {
		this.data=n;

	}
}
class Linked_Stack<R>{
	Node<R> head;
	Node<R> nextNode;
	int size;
	
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void push(R n) {
		Node<R> p;
		for(p=head; p.nextNode!=null; p=p.nextNode) {
			
		}
		size++;
		p.nextNode=new Node<R>(n);
	}
	
	public R peek() {
		if (head==null) return null;
		return head.data;

	}
	
	public R pop() {
		R temp=null;
		if (head==null) {
			System.out.println("List is already empty");
		}
		else {
		temp = head.data;
		head=head.nextNode;
		head.nextNode=null;
		}
		return temp;
	}
	
	public void display() {
		if (head==null) {
			System.out.println("List is Empty");
		}
		else {
			System.out.println("Elements Of List Are;");
			for (Node<R> p=head; p!=null; p=p.nextNode) {
				System.out.println(head.data);
			}
		}
	}
}
public class DSA_LAB_09_Q2 {
	public static void main(String[] args) {
		Linked_Stack<Object> List= new Linked_Stack<Object>();
		
		List.push(235);
		List.pop();
		
		List.peek();
		List.display();
		
	}
}
 