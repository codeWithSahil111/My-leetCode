class Solution {
    public static boolean selfDNumber(int n){
        if (n <= 0) {
            return false;
        }
        
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>();

        for(int i = left; i<=right; i++){
            if(selfDNumber(i)){
                ans.add(i);
            }
        }
        return ans;
    }
}