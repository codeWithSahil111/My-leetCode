class Solution {
    public int removeElement(int[] nums, int val) {
       int lp = 0;
       int rp = nums.length-1;
       while(lp<=rp) {
        if(nums[lp] == val) {
            nums[lp] = nums[rp];
            rp--;
        } else{
            lp++;
        }
       }
       return lp;
    }
}