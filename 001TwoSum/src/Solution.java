import java.util.Arrays;


public class Solution {
/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
	
	EXAMPLE:
	Given nums = [2, 7, 11, 15], target = 9,

	Because nums[0] + nums[1] = 2 + 7 = 9,
	return [0, 1].*/
			
	public int[] twoSum(int[] nums, int target) {
		int l = nums.length;
		int x = 0;
		int y = 1;
		
		Mark: for(int x_r = x ; x_r<l; x_r++) {
			for (int y_r = y ; y_r<l; y_r++) {
				if(x_r+y_r==target){
					x = x_r;
					y = y_r;
					break Mark;//Ìø×ªÓïÑÔ±ê¼Ç
				}
			}
		}
		int[] result = {x, y};
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {3, 5, 9, 0, 2, 7, 11, 15};
		int target = 9;
		
		Solution sol = new Solution();
		int[] result = sol.twoSum(nums, target);
		System.out.print(Arrays.toString(result));
	}

}
