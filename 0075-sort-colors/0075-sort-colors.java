class Solution {
    public void sortColors(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        int pointer = 0;

        while(pointer <= j){
            if(nums[pointer] == 0){
                int temp = nums[i];
                nums[i] = nums[pointer];
                nums[pointer] = temp;
                i++;
                pointer++;
            } else if(nums[pointer] == 1){
                pointer++;
            } else{
                int temp = nums[j];
                nums[j] = nums[pointer];
                nums[pointer] = temp;
                j--;
            }
        }
    }
}