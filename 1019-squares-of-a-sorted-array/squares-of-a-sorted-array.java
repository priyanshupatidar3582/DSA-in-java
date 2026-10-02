public class Solution{
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int l = 0;
        int r = n-1;
        //Insert the values from last so that the largest sq value get placed at last position & so on. 
        for(int pos = n-1;pos >= 0;pos--){
            int leftSq = nums[l]*nums[l];
            int rightSq = nums[r]*nums[r];
            if(leftSq>rightSq){
                ans[pos] = leftSq;
                l++;
            }
            else{
                ans[pos] = rightSq;
                r--;
            }
        }
        return ans;
    }
}