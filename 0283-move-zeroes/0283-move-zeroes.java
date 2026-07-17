class Solution {
    public void moveZeroes(int[] arr) {
       int slow = 0;
       for(int fast = 0; fast<arr.length; fast++){
        if(arr[fast] != 0){
           int temp = arr[slow];
           arr[slow] = arr[fast];
           arr[fast] = temp;
           slow++;
        }
       }
    }
}