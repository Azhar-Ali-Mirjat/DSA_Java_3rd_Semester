
public class ArrayClass {
	String name = "Azhar";
	String[] names = new String[10];
	
	public void insert() {
		names[0]="Azhar";
		names[1]="Shahid";
		names[2]="Haseeb";
		
		}
	
	public void display() {
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}


	public static void main(String[] args) {
		ArrayClass arrays = new ArrayClass();
		arrays.insert();
		arrays.display();
		
	}

}
