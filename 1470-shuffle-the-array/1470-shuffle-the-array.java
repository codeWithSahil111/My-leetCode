class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[] = new int[2 * n];

        int x = 0;
        int y = 1;

        for(int i =0; i<n; i++){
            ans[x] = nums[i];
            ans[y] = nums[i + n];
            
            x += 2;
            y += 2;
        }
        return ans;
    }
}