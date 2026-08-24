class Solution {
    public int rob(int[] nums) {
       int oneBag = 0;
       int twoBag = 0;

       for(int money : nums){
        int temp = Math.max(oneBag , twoBag + money);
        twoBag = oneBag ;
        oneBag  = temp;
       }
       return oneBag;
    }
}