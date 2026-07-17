/*
In this problem, the logic is very simple. While iterating the array, i have to just choose whether to add the current value to the currentSum or replace currentSum with the current value, then compare the currentMax and the maxSum.
*/
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        
        for(int i=1;i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum+nums[i]);
            maxSum = Math.max(currentSum,maxSum);
        }
        
        return maxSum;
    }
}

// Separate Main class in same file
public class Q53_MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {5,4,-1,7,8};
        Solution sol = new Solution();

        int maxSum = sol.maxSubArray(arr);

        System.out.println("The maximum subarray sum is: " + maxSum);
    }
}

/*
public int maxSubArray(int[] nums) {
    long maxi = Long.MIN_VALUE; 
    long sum = 0; 
    
    for (int i = 0; i < nums.length; i++) {
        sum += nums[i]; 
        if (sum > maxi) {
            maxi = sum; 
        }
        if (sum < 0) {
            sum = 0; 
        }
    }
    return (int) maxi;
}
*/