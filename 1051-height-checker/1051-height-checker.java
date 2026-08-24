class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;

        int newHights[] = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            newHights[i] = heights[i];
        }

        for (int i = 0; i < heights.length; i++) {
            for (int j = i; j < heights.length; j++) {
                if (heights[i] > heights[j]) {
                    int temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != newHights[i]) {
                count++;
            }
        }
        return count;
    }
}