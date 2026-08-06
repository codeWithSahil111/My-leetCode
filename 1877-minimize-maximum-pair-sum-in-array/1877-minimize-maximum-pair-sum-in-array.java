class Solution {
    public int minPairSum(int[] nums) {
        int sum2 = 0;
        int i =0;
        int j = nums.length-1;

        Arrays.sort(nums);

        while(i<j){
            int sum = nums[i]+nums[j];
            sum2 = Math.max(sum ,sum2);
            i++;
            j--;
        }
        return sum2;
    }
}