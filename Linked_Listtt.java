
class NodeList {
	int data;
	NodeList next;
   
	public NodeList(int data) {
		this.data=data;
	}
}

class Linked {
  NodeList head;

  Linked(){
    head = null;
  }

  //Add new element at the end of the list
  void print_Elements(int newElement) {
    NodeList newNode = new NodeList(11111);
    newNode.data = newElement;
    newNode.next = null; 
    if(head == null) {
      head = newNode;
    } else {
      NodeList temp = new NodeList(2222);
      temp = head;
      while(temp.next != null)
        temp = temp.next;
      temp.next = newNode;
    }    
  }

  //Search an element in the list
  void SearchElement(int searchValue) {
    NodeList temp = new NodeList(333333);
    temp = this.head;

    int found = 0;
    int i = 0;

    if(temp != null) {
      while(temp != null) {
        i++;
        if(temp.data == searchValue) {
          found++;
          break;
        }
        temp = temp.next;
      }
      if (found == 1) {
        System.out.println(searchValue + " is found at index = " + i +".");
      } else {
        System.out.println(searchValue + " is not found in the list.");
      }
    } else {
      System.out.println("The list is empty.");
    }
  }   

  //display the content of the list
  void PrintList() {
    NodeList temp = new NodeList(444444);
    temp = this.head;
    if(temp != null) {
      System.out.print("The list contains: ");
      while(temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }
      System.out.println();
    } else {
      System.out.println("The list is empty.");
    }
  }    
};

// test the code
public class Linked_Listtt {
  public static void main(String[] args) {
    Linked MyList = new Linked();

    //Add three elements at the end of the list.
    MyList.print_Elements(10);
    MyList.print_Elements(20);
    MyList.print_Elements(30);
    MyList.print_Elements(40);
    MyList.print_Elements(50);
    MyList.print_Elements(60);
    MyList.print_Elements(70);
    MyList.print_Elements(80);
    MyList.print_Elements(90);
    MyList.print_Elements(100);

    //traverse to display the content of the list.
    MyList.PrintList(); 

    //search for element in the list
    MyList.SearchElement(10);
    MyList.SearchElement(15);
    MyList.SearchElement(20);
  }
}
