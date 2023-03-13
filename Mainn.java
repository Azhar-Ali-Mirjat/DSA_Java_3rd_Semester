
//class LinkedList{
//    NewNode head;
//    
//    public void printList(){
//        for (NewNode n= head;n!=null;n=n.next){
//            System.out.println(n.data);
//        }
//            System.out.println(head.size);
//    }
//    
//    public void insertAtFirst(String data){
//        
//        
//        head = new NewNode(data,head);
//        
//    }
//    
//    public void insertAtEnd(String data){
//        NewNode n ;
//        for(n=head;n.next!=null;n=n.next){}
//        n.next = new Node(data); 
//    }
//    
//    public void insertAtMid(String data,int pos){
//        NewNode n = head;
//        for(int i=0;i<head.size;i++){
//            if(i+2==pos){
//                n.next = new NewNode(data,n.next);
//            }
//            n = n.next;
//        }
//    }
//    
//    public void searchInList(String data){
//        int search = 0;
//        for(NewNode n = head;n!=null;n=n.next){
//            search++;
//            if(n.data.equalsIgnoreCase(data)) {   
//            System.out.println("Found sound "+n.data+ " at position "+search);
//            break;
//        }
//        }
//    }
//    
//    public void deleteFirst(){
//        head = head.next;
//        head.size--;
//    }
//    
//    public void deleteAtMid(int pos){
//        NewNode n = head;
//        for(int i=1;i<n.size;i++){
//            if(i+2==pos){
//                break;
//            }
//        }
//        n.size--;
//        n.next = n.next.next;
//    }
//    
//    public void deleteAtEnd(){
//        NewNode n;
//        for(n=head;n.next.next!=null;n=n.next){
//            
//        }
//        
//        n.next = n.next.next;
//        n.size--;
//        
//    }
//}
//class NewNode{
//    String data;
//    Node next;
//    static int size=0;
// 
//    NewNode(String data,NewNode next){
//        size++;
//        this.data = data;
//        this.next = next;
//        
//    }
//    NewNode(NewNode next){
//        this.next = next; 
//    }
//}
//
//        
//
//
//public class Main
//{
//	public static void main(String[] args) {
//		LinkedList ll = new LinkedList();
//		ll.insertAtFirst("Kaafi");
//		ll.insertAtFirst("Cold hours");
//		ll.insertAtFirst("Laga Reh");
//		ll.insertAtFirst("Life Goes On");
//		ll.insertAtFirst("Kaise");
//		ll.insertAtEnd("Anjaan");
//		ll.insertAtMid("Maqaam",4);
//		ll.deleteAtEnd();
//		ll.deleteFirst();
//		ll.deleteAtMid(3);
//		ll.printList();
//		ll.searchInList("Life Goes On");
//	}
//}















public class Mainn
{
    public static void main(String[] args) {

        LinnnkedList routes = new LinnnkedList();
        routes.add("Hostel Gate");
        routes.add("Route A");
        routes.add("Route B ");
        routes.add("Bus Route . ");
        routes.add("My Mehran UET");
        routes.display();
    }
    
}
class LinnnkedList{
	Node head;
    int size=0;
	public void display(){
		Node temp = head;
		while(temp!=null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void add(String dat){
		if(size==0){
			head = new Node(dat);
		}
		else{
			Node p = head;
			while(p.next!=null){
				
				p=p.next;
			}
			p.next=new Node(dat);
		}
        size++;
		
		
	}	
}
class Node{
	String data;
	Node next;
	Node(String data){
		this.data = data;
	}
} 

