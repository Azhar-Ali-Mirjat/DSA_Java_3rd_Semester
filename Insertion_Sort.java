
class Solution {
	void insertionSort (int[] arr) {
		// add your logic here
	for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
}
public class Insertion_Sort {

	public static void main(String[] args) {
		Solution solution =new Solution();
		int[] arr = {12,14,16,13,15};
		solution.insertionSort(arr);
		
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]);
			if(k<arr.length-1) {
				System.out.print(",");
			}
		}
	}

}
