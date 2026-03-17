class Solution {
    public int minOperations(int n) {
        int count = 0;

        while (n > 0) {
            if ((n & 1) == 0) {
                n >>= 1;
            } else {
                if (n == 3) {
                    count += 2;
                    break;
                }
                if ((n & 3) == 3) {
                    n++;
                } else {
                    n--;
                }
            }
            count++;
        }

        return count;
    }
}
