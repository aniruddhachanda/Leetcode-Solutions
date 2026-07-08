class Solution {
    static final int MOD = 1_000_000_007;
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        long[] pow10 = new long[n + 1];
        pow10[0] = 1;
        for (int i = 1; i <= n; i++) {
            pow10[i] = (pow10[i - 1] * 10) % MOD;
        }

        int[] cnt = new int[n + 1];
        int[] sum = new int[n + 1];
        long[] hash = new long[n + 1];

        for (int i = 0; i < n; i++) {
            cnt[i + 1] = cnt[i];
            sum[i + 1] = sum[i];
            hash[i + 1] = hash[i];

            int d = s.charAt(i) - '0';
            if (d != 0) {
                cnt[i + 1]++;
                sum[i + 1] += d;
                hash[i + 1] = (hash[i] * 10 + d) % MOD;
            }
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            int k = cnt[r + 1] - cnt[l];
            int digitSum = sum[r + 1] - sum[l];

            long leftHash = hash[l];
            long rightHash = hash[r + 1];

            long x = (rightHash - (leftHash * pow10[k]) % MOD + MOD) % MOD;

            ans[i] = (int) ((x * digitSum) % MOD);
        }

        return ans;
    }
}