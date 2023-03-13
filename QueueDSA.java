package LAB_TASKS;

class ArraySQueue{
	int capacity;
	int front, rear;
	Object []queue;
	
	public ArraySQueue(int cap) {
		this.capacity=cap;
		front=rear=0;
		queue = new Object[capacity];
	}
	
	public void addToQueue(Object data) {
		if (rear==capacity) {
			System.out.println("Queue if Full");
		}
		else {
			queue[rear]=data;
			System.out.println("Element Added is : "+queue[rear]);
			rear++;
		}
	}
	
	public void removeFirst() {
		System.out.println("One element removed Successfully");
		if (capacity==rear) {
			rear--;		
			return;
		}
		else {			
			for ( front = 0; front <= rear; front++) {
				queue[front]=queue[front+1];
			}
				rear--;
		}
	}
	
	public boolean queueIsFull() {
		return (capacity==rear);
	}
	
	public boolean queueIsEmpty() {
		return (capacity==0);
	}
	
	public int size() {
		return capacity;
	}
	
	
	public void display() {
		if (front==rear) {
			System.out.println("Queue Empty");
		}
		System.out.println("Element in Queue Are : ");
		for (int i =front; i < rear; i++) {
			System.out.print(queue[i]+"<=");
		}
	}
	
	public void displayQueue() {
		System.out.println("Elements in queue are: ");
		for (front= 0; front < queue.length; front++) {
			System.out.print(queue[front]+"<=");
			
		}
	}
}
public class QueueDSA {
	public static void main(String[] args) {
		ArraySQueue queue= new ArraySQueue(4);
		queue.addToQueue("1st");
		queue.addToQueue("2nd");
		queue.addToQueue("3rd");
		queue.addToQueue("4th");
//		queue.addToQueue("5th");
		queue.removeFirst();
		queue.display();
		
	}

}
