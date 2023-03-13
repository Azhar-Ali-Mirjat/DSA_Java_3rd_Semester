
class Listttt{
	int data;
	Listttt nextList;
	
	public Listttt(int data) {
		this.data=data;
		nextList=null;
			
	}
	
	public void insertion(int data) {
		Listttt list= new Listttt(data);
		System.out.print(data+",");
	}
	
	
		
}


public class Linked_List {

	public static void main(String[] args) {
		Listttt lList = new Listttt(4);
		lList.insertion(4);
		lList.insertion(44);
		lList.insertion(454);
		lList.insertion(544);
		lList.insertion(445);
		

	}

}
