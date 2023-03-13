

//LEETCODE 217
/*Given an integer array []nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.*/

class Array {
	    public boolean containsDuplicate(int[] nums) {
	        for(int i=0; i<nums.length; i++)
	        {
	           for(int j=i+1; j<nums.length; j++){
	               if(nums[i]==nums[j]){ return true;} 
	           }
	        }
	        return false;
	    }	
}

public class Soluton1{
	public static void main(String[] args) {
		Array array = new Array();
		int nums[]= {1,2,3,4,2,6,5,2,5,6,8,9,5};
		boolean x=array.containsDuplicate(nums);
		System.out.println(x);
	}
}