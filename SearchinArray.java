
//LEETCODE #33
/*Given the array nums after the possible rotation and an integer target,
return the index of target if it is in nums,or -1 if it is not in nums.*/

class Solution{
	   public int search(int[] nums, int target) {
	        int j=0;
	        for(int i=0; i<nums.length; i++){
	            if(nums[i]==target){ j=i; return j;}
	            else{ j=-1;}
	        }
	        	return j;
	   }	
}
public class SearchinArray{
	public static void main(String[] args) {
		Solution s1 = new Solution();
		int nums[]= {1,2,3,4,5,6,7,8,9,11,22,33,44,55,66};
		
		int x=s1.search(nums,22);
		System.out.println("Element Searched is at index: "+x);
	}
}