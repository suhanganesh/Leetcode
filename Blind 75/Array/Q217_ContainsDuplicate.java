/* 
You can just sort the element and then later compare it with the next element. 
or else you can use HashMap to check if the element already exists in the map, else add it to the map.
You can also use brute force approach by using two loops.
*/

import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}

public class Q217_ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3};
        Solution sol = new Solution();
        boolean res = sol.containsDuplicate(nums);
        System.out.println(res ? "true" : "false");
    }
}

/*
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int value:nums) {
            if(seen.contains(value)){
                return true;
            }
*/