class Solution {
    public int minimumSwaps(int[] nums) {
        int zeroCount = 0;
        for (int num : nums) {
            if (num == 0) {
                zeroCount++;
            }
        }

        int swaps = 0;
        int nonZeroPart = nums.length - zeroCount;

        for (int i = 0; i < nonZeroPart; i++) {
            if (nums[i] == 0) {
                swaps++;
            }
        }

        return swaps;
    }
}