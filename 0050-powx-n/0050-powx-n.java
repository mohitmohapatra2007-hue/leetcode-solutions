class Solution {
    public double myPow(double x, int n) {

        if (x == 0) {
            return 0;
        }

        if (n == 0) {
            return 1;
        }

        double result = Math.exp(n * Math.log(Math.abs(x)));

        if (x < 0 && n % 2 != 0) {
            result = -result;
        }

        return result;
    }
}