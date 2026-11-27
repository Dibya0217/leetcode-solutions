class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length) {
            int curr = nums[i] - 1;
            if(nums[i] != nums[curr]) {
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
            } else i++;
        }

        List<Integer> list = new ArrayList<>();
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1) list.add(j+1);
        }

        return list;
    }
}