class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int start = 0;
       int end = nums.length-1;
        int mid = 0; 
       while(mid < end){
        if(nums[mid] % 2 == 0){
            int temp = nums[start];
            nums[start] = nums[mid];
            nums[mid] = temp;
            mid++;
            start++;
        } else {
            int temp = nums[end];
            nums[end] = nums[mid];
            nums[mid] = temp;
            end--;
        }
       }
       return nums;
    }
}