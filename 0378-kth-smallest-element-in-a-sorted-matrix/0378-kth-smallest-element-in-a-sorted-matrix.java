class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows = matrix.length;
        int colm = matrix[0].length;
        int arr[] = new int[rows * colm];
        int idx = 0;
        for(int i =0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
              arr[idx] = matrix[i][j];
              idx++;  
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}