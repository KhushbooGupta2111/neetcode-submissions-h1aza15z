class Solution {
    public int mySqrt(int x) {

        if (x < 2) return x;

        int lower = 1;
        int upper = x / 2;
        int res = 0;

        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;

            long square = (long) mid * mid;

            if (square == x) {
                return mid;
            } else if (square > x) {
                upper = mid - 1;
            } else {
                res = mid;
                lower = mid + 1;
            }
        }
        return res;
    }
}