package leetcode;
/**
 * MAXIMUM SUBARRAY
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array.
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:

 * Input: nums = [1]
 * Output: 1
 * Example 3:

 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * */

public class MaximumSubArray {
    public static void main(String[] args) {
        int[] array = new int[] {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(array));
    }
        public static int maxSubArray(int[] nums) {
        int max = nums[0], sum = max;
        for(int i = 1 ; i < nums.length ; i++) {
            max = Math.max(nums[i], nums[i] + max);
            sum = Math.max(sum, max);
        }
        return sum;
    }
}
