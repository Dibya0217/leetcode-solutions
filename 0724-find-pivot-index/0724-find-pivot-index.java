class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = sum(nums);
        int div = 0;

        for(int i = 0; i < nums.length; i++) {
            totalSum -= nums[i];
            if(totalSum == div) return i;
            div += nums[i];
        }
        return -1;
    }
    public int sum(int[] nums) {
        int total = 0;
        for(int i = 0; i < nums.length; i++) {
            total += nums[i];
        }
        return total;
    }
}