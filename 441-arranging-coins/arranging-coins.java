
class Solution {
    public long squre(long n) {
        if (n == 0) {
            return 0;
        }

        long l = 1;
        long h = n;

        while (l <= h) {
            long mid = l + (h - l) / 2;

            if (mid == n / mid)
                return mid;
            else if (mid > n / mid)
                h = mid - 1;
            else
                l = mid + 1;
        }

        return h;
    }

    public int arrangeCoins(int n) {
        return (int)((squre(8L * n + 1) - 1) / 2);
    }
}
