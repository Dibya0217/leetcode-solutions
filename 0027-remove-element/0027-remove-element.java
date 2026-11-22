class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0, j = 0, count = 0;
        while(j < nums.length) {
            if(nums[j] != val) {
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j] = temp;
                count++;
            }
            j++;
        }
        return count;
    }
}