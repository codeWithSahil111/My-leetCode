class Solution {
    public void moveZeroes(int[] arr) {
        int left = 0;

        for(int right = 0; right<arr.length; right++) {
            if(arr[right] != 0){
                arr[left] = arr[right];
                left++;
            }
        }
        while(left<arr.length){
            arr[left] = 0;
            left++;
        }
    }
}