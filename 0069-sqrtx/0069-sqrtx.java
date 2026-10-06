class Solution {
    public int mySqrt(int x) {

        if (x < 2) {
            return x;
        }

        int first = 1;
        int end = x;
        int ans = 0;

        while (first <= end) {

            int mid = first + (end - first) / 2;

            if (mid <= x / mid) {
                ans = mid;
                first = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }

        return ans;
    }
}