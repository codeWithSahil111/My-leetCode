class Solution {
    public List<Integer> findMissingElements(int[] nums) {
       int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = min; i <= max; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
}