class Solution {
    public int findMiddleIndex(int[] nums) {
        int lSum = 0;
        for(int num : nums) {
            lSum += num;
        }
        int rSum = 0;

        for(int i = 0; i < nums.length; i++) {
            lSum -= nums[i];
            if(lSum == rSum) return i;
            rSum += nums[i];
        }
        return -1;
    }
}