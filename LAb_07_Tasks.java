
class Linkedlist {
    
	  
    class Link{  
        int data;  
        Link previous;  
        Link next;  
  
        public Link(int data) {  
            this.data = data;  
        }  
}  
  
     
    Link head;
	Link tail = null;  
  
     
    public void addNode(int data) {  
         
        Link newNode = new Link(data);  
  
         
        if(head == null) {  
            
            head = tail = newNode;  
              
            head.previous = null;  
             
            tail.next = null;  
        }  
        else {  
             
            tail.next = newNode;  
           
            newNode.previous = tail;  
           
            tail = newNode;  
             
            tail.next = null;  
        }  
    }  
  
     
    public  void deleteFromStart() {  
         
        if(head == null) {  
            return ;  
        }  
        else {  
              
            head=head.next;
            head.previous=null;
        }
		return ;  
    } 
    
    
    public void deleteAtlast()
    {
    	System.out.println("The deleted elements are:");
    	if(head==null)
    	{
    		return ;
    	}
    	
    	else {
    		head.next=null;
			
			
					
		}
    
    }
//       public void insertAtLast(int data)
//       {
//    	   Node temp;
//    	   System.out.println("Inserting element at last");
//    	   if(head==null)
//    	   {
//    		   head= new Node(22);
//    	   }
//       }
  
     
    public void display() {  
  for(Link p = head ; p!=null; p = p.next) {
	  System.out.println(p.data);
  }
}
}

public class LAb_07_Tasks {
	public static void main(String[] args) {
		Linkedlist list = new Linkedlist();
		
		list.addNode(12);
		list.addNode(14);
		list.addNode(16);
		list.display();
		
		
	}

}
