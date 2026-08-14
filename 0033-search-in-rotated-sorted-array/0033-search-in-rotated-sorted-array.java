class Solution {
    public static int searchIt(int arr[],int target,int si,int ei) {

        if(si > ei) {
            return -1;
        }

    int mid = si+(ei-si)/2;

    if(arr[mid] == target) {
        return mid;
    } 

    if(arr[si] <= arr[mid]) {
        if(arr[si] <= target && target <= arr[mid]) {
            return searchIt(arr, target, si, mid-1);
        } else {
            return searchIt(arr, target, mid+1, ei);
        }
    } else {
        if(arr[mid] <= target && target <= arr[ei]) {
            return searchIt(arr, target, mid+1, ei);
        } else {
            return searchIt(arr, target, si, mid-1);
        }
    }
}
    public int search(int[] arr, int target) {
        return searchIt(arr, target, 0, arr.length-1);
    }
}
