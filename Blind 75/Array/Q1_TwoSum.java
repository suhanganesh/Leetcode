import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0;i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{}; 
    }
}

class Q1_TwoSum{
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {3,2,4};
        int target = 6;
         System.out.println(sol.twoSum(arr, target));
        int[] res = sol.twoSum(arr, target);
        System.out.println("[" + res[0] + ", " + res[1] + "]");
    }
}
/* 
import java.util.Arrays;

class Solution{
    public int[] twoSum(int[] nums, int target){
        Arrays.sort(nums);
        int left = 0;
        System.err.println(nums[left]+" "+nums[0]);
        int right = nums.length-1;
        while(left<right){
            int sum = nums[left]+nums[right];
            System.err.println(nums[left] +" + " +right+" = "+sum);
            if(target == sum){
                return new int[]{left,right};
            }else if(target > sum){
                left++;
            }else right --;
        }
        return new int[]{-1,-1};
    }
}

*/