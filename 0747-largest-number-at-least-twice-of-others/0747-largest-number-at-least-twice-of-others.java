class Solution {
    public int dominantIndex(int[] nums) {
        int largest = -1;
        int secondLargest = -1;
        int larestIndex = -1;

        for(int i = 0; i < nums.length; i++) {
            if(largest < nums[i]) {
                secondLargest = largest;
                largest = nums[i];
                larestIndex = i;
            } else if(secondLargest < nums[i]) secondLargest = nums[i];
        }
        if(secondLargest * 2 <= largest) return larestIndex;
        return -1;
    }
}