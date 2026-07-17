class Solution {
    public static void swap(int nums[], int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int mid = 0;
        int end = nums.length-1;

        while(mid <=  end){
            if(nums[mid]  % 2 == 0){
                swap(nums, start,mid);
                mid++;
                start++;
            } else{
                swap(nums,mid,end);
                end--;
            }
        }
        return nums;
    }
}