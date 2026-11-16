class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1;
        int count = 1;
        while(j < nums.length) {
            if(nums[i] == nums[j]) j++;
            else {
                int temp = nums[j];
                nums[j++] = nums[++i];
                nums[i] = temp;
                count ++;
            }
        }
        return count;
    }
}