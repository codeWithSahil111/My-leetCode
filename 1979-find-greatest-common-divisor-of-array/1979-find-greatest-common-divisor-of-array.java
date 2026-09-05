class Solution {
    public int findGCD(int[] nums) {
        int n = nums.length;
        int smalest = nums[0];
        int largest = nums[0];

        for(int i =1; i<n; i++){
            if(nums[i] < smalest){
                smalest = nums[i];
            } else if( nums[i] > largest){
                largest = nums[i];
            }
        }
        for(int i = smalest; i>=1; i--){
            if(smalest % i == 0 && largest % i == 0){
                return i;
            }
        }
        return 1;
    }
}