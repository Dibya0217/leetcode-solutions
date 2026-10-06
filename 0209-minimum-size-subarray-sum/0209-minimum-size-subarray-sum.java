class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int minDistance = Integer.MAX_VALUE;
        int runningSum = 0;

        while(right < nums.length) {
            runningSum += nums[right];
            while(runningSum >= target) {
                minDistance = Math.min(minDistance, right - left + 1);
                runningSum -= nums[left];
                left++;
            }
            right++;
        }
        return minDistance == Integer.MAX_VALUE ? 0 : minDistance;
    }
}