class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> tempSet = new HashSet<>();

        for(int i =0; i<nums1.length; i++){
            set.add(nums1[i]);
        }
        for(int i =0; i<nums2.length; i++){
            if(set.contains(nums2[i])){
                tempSet.add(nums2[i]);
            }
        }
       int ans[] = new int[tempSet.size()];

        int j = 0;
        for (int num : tempSet) {
            ans[j] = num;
            j++;
        }

        return ans;
    }
}