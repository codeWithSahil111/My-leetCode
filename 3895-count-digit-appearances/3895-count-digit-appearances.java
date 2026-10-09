class Solution {
    public static int digitCounter(int n,int digit){
        int counter = 0;
        while(n > 0){
            int d = n %10;
            if(d == digit){
                counter++;
            }
            n = n/10;
        }
        return counter;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
        int totalDigits = 0;
        for(int i =0; i<nums.length; i++){
            totalDigits += digitCounter(nums[i],digit);
        }
        return totalDigits;
    }
}