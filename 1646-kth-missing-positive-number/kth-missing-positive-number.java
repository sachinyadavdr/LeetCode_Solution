class Solution {
    public int findKthPositive(int[] arr, int k) {
        int p = 0;
        int l = 0;
        int n = arr.length - 1;
        for (int i = 0; i < arr[n]; i++) {
            if (arr[p] != i + 1) {
                k--;
            } else {
                p++;
            }
            if (k == 0) {
                return i + 1;
            }
            l = i + 1;
        }
        return l + k;
    }
}