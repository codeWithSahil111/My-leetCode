class Solution {
    public static int digitSum(int num){
        int sum = 0;
        while(num > 0){
            int d = num %10;
            sum += d;
            num = num /10;
        }
        return sum;
    }
    public int countEven(int num) {
        int count = 0;
        for(int i =1; i<=num; i++){
            int sum = digitSum(i);
            if(sum % 2 == 0){
                count++;
            }
        }
        return count;
    }
}