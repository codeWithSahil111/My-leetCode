class Solution {
    public int countPairs(List<Integer> nums, int target) {
        Collections.sort(nums);
        int p1 = 0;
        int p2 = nums.size()-1;

        int ans = 0;    

        while(p1 < p2 ){
            int sum = nums.get(p1) + nums.get(p2);
            if(sum < target){
                ans = ans + (p2-p1); 
                p1++;
            }  else {
                p2--;
            }
        }
        return ans;
    }
}