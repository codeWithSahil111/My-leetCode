class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;

        int newHights[] = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            newHights[i] = heights[i];
        }

        Arrays.sort(heights);
       
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != newHights[i]) {
                count++;
            }
        }
        return count;
    }
}