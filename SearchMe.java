
class Searching{
	
	public int search(int[] arra , int target) {
		for (int i = 0; i < arra.length; i++) {
			if (arra[i]==target) {
				return i;
								
			}
				

	}
		return -1;
}
}

public class SearchMe {

	public static void main(String[] args) {
		int[] arra= {12,23,34,45,56,67,78,89,90};
		Searching searching= new Searching();
		//System.out.print("Found at index : "+searching.search(arra, 56));
		
		int k = searching.search(arra, 23);
		if (k>0) {
			System.out.print("Element is at Index : "+k);
		}
		else {
			System.out.println("Not Found");
		}

	}

}
