
class Range{
	
	public static int[] range(int[] arr , int target) {
		int[] a = new int[2];
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {
				if(arr[i] == target && !found) {
					a[0] = i;
					a[1] = i;
					found = true;
				}
				if(arr[i] == target && found) {
					a[1] = i;
				}
		}
		
		
		return a;
		
	}
}

public class RangeFind {

	public static void main(String[] args) {
		int[] arr = {1 , 2 ,4 ,5 ,5,5,5,5,7,8,9 };
		int[] res = Range.range(arr, 9);
		System.out.println(res[0] + " " + res[1]);
		
	}

}
