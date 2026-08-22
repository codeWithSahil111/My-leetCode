class Solution {
    public boolean checkDivisibility(int n) {
      int temp = n;
      int dsum = 0;
      int dpro = 1;

      while(temp > 0){
        dsum += temp % 10;
        dpro *= temp % 10;
        temp = temp / 10; 
      }
      return n % (dsum + dpro) == 0;
    }
}