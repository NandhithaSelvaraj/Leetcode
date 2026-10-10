class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] diff = new int[n];
        long total = (long) k1 + k2;

        int max = 0;

        for (int i = 0; i < n; i++) {
            diff[i] = Math.abs(nums1[i] - nums2[i]);
            max = Math.max(max, diff[i]);
        }

        if (total >= 0) {
            long sum = 0;
            for (int d : diff) {
                sum += d;
            }
            if (total >= sum) {
                return 0;
            }
        }

        int[] freq = new int[max + 1];

        for (int d : diff) {
            freq[d]++;
        }

        while (total > 0 && max > 0) {
            if (freq[max] > total) {
                freq[max] -= (int) total;
                freq[max - 1] += (int) total;
                total = 0;
            } else {
                total -= freq[max];
                freq[max - 1] += freq[max];
                freq[max] = 0;
                max--;
            }
        }

        long answer = 0;

        for (int d = 1; d < freq.length; d++) {
            answer += (long) d * d * freq[d];
        }

        return answer;
    }
}