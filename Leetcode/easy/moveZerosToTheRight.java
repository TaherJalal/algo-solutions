class Solution {
    public void moveZeroes(int[] nums) {
         int index = 0;
        for (int n : nums) {
            if (n != 0) {
                nums[index] = n;
                index++;
            }
        }
        while (index <= nums.length) {
            nums[index] = 0;
            index++;
        }
    }
}
