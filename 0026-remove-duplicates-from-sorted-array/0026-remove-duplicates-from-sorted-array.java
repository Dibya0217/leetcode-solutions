class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1, count = 1;

        while(j < nums.length) {
            if(nums[i] != nums[j]) {
                int temp = nums[++i];
                nums[i] = nums[j];
                nums[j] = temp;
                count++;
            }
            j++;
        }
        return count;
    }
}