class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        int i = 0;
        int j = n-1;
        int idx = n-1;

        while(i <= j){
            int leftSq = nums[i] * nums[i];
            int righSq = nums[j] * nums[j];

            if(leftSq > righSq){
                ans[idx] = leftSq;
                i++;
                idx--;
            } else{
                ans[idx] = righSq;
                j--;
                idx--;
            }
        }
        return ans;
    }
}