class Solution {
    public int distributeCandies(int[] candyType) {
        int n = candyType.length;

        Set<Integer> set = new HashSet<>();
        for(int num : candyType){
            set.add(num);
        }
        int type = set.size();
        return Math.min(type,n/2);
    }
}