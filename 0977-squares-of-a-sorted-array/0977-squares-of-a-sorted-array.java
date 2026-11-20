class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int [] num = new int[nums.length];

        for(int i = num.length - 1; i >= 0; i--) {
            int leftSquares = nums[left] * nums[left];
            int rightSquares = nums[right] * nums[right];

            if(leftSquares > rightSquares) {
                num[i] = leftSquares;
                left++;
            } else {
                num[i] = rightSquares;
                right--;
            }
        }
        return num;
    }
}