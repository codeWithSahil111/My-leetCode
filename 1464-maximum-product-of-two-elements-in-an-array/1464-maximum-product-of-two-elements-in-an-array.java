class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int fm = nums[n-1];
        int sm = nums[n-2];

        return (fm-1) * (sm-1);
    }
}