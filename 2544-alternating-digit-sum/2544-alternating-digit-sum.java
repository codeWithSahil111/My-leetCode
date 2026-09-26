class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        int sign = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * sign;

            sign = -sign;
            n /= 10;
        }

        if (sign == 1) {
            return -sum;
        }

        return sum;
    }
}