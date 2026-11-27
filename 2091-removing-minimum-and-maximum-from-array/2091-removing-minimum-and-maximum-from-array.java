class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length; 
        int maxIdx =0;
        int minIdx = 0;

         for(int i = 1; i < n; i++){
            if(nums[i] > nums[maxIdx]){
                maxIdx = i;
            }

            if(nums[i] < nums[minIdx]){
                minIdx = i;
            }
        }

        int left = Math.min(minIdx,maxIdx);
        int right = Math.max(minIdx,maxIdx);

        int remFF = right +1;
        int remFB = n - left;
        int remBS = (left + 1) + (n - right);


        return Math.min(remFF,Math.min(remFB,remBS));
    }
}