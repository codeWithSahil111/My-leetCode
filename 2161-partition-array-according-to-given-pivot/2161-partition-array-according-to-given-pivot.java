class Solution {
    public int[] pivotArray(int[] arr, int pivot) {
         int n = arr.length;
        int ans[] = new int[n];
        int ltp = 0;
        int gtp = 0;
        int etp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == pivot) {
                etp++;
            } else if (arr[i] < pivot) {
                ltp++;
            } else {
                gtp++;
            }
        }
        int i = 0;
        int j = ltp;
        int k = ltp + etp;
        for (int p = 0; p < n; p++) {

            if (arr[p] < pivot) {
                ans[i] = arr[p];
                i++;

            } else if (arr[p] == pivot) {
                ans[j] = arr[p];
                j++;

            } else {
                ans[k] = arr[p];
                k++;
            }
        }

        return ans;
    }
}