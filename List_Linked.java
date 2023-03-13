
class List{
	int data;
	List next;

	public List(int data) {
		this.data=data;
	}
	
	public void addFirst(int data) {
		int temp = data;
			System.out.println(data);
			
		
	}
	
	
}

public class List_Linked {

	public static void main(String[] args) {
		List newList = new List(2);
		newList.addFirst(23);
		newList.addFirst(33);
		

	}

}
