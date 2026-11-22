class Solution {
    public int maxWidthRamp(int[] nums) {
         int n = nums.length;

        int[] suffixMax = new int[n];

        suffixMax[n - 1] = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(nums[i], suffixMax[i + 1]);
        }

        int i = 0;
        int j = 0;
        int maxW = 0;

        while (i < n && j < n) {
            if (nums[i] <= suffixMax[j]) {
                maxW = Math.max(maxW, j - i);
                j++;
            } else {
                i++;
            }
        }

        return maxW;
    }
}