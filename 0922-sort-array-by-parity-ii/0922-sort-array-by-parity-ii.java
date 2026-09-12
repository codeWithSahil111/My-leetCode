class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ev = 0;
        int od = 1;

        while (ev < nums.length && od < nums.length) {

            if (nums[ev] % 2 != 0) {
                while (od < nums.length && nums[od] % 2 == 1) {
                    od += 2;
                }
                int temp = nums[ev];
                nums[ev] = nums[od];
                nums[od] = temp;
            }

            ev += 2;
        }

        return nums;
    }
}