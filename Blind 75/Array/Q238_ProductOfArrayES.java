/*
In this problem, I had to find the product on the left and store it and then multiple it to the product on the right of the right of the current number. 
I had to use two loops and a create a new array to store the product. I have to properly use the logic of how i am multiplying the number before and after the number. 
 */


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        answer[0]=1;
        for (int i =1; i < n; i++) {
            answer[i]=answer[i-1]*nums[i-1];
        }

        int right = 1;
        for (int i = n-1; i>=0; i--) {
            answer[i]=answer[i]*right;
            right*=nums[i];
        }
        return answer;
    }
}

class Q238_ProductOfArrayES{
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] arr = {-1,1,0,-3,3};
        int[] prod = sol.productExceptSelf(arr);
        for(int p:prod){
            System.out.print(p);
        }
    }
}