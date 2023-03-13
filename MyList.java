
class List {
	String[] list = null;
	int pointer =0;
	
	public List() {
		list = new String[10];
	}
	
	public List(int size) {
		list = new String[size];
	}
	
	public void add(String data) {
		list[pointer]=data;
		++pointer;
	}
	
	public int size() {
		return list.length;
	}
	
	public String get(int index) {
		return list[index];
	}
	
		
}

public class MyList{
	public static void main(String[] args) {
		List newList = new List();
		
		newList.add("Azhar");
		newList.add("Meer");
		newList.add("Sahib");
		newList.add("Khan");
		
		for (int i = 0; i <newList.size(); i++) {
			System.out.println(newList.get(i));
		}
	}		
}
