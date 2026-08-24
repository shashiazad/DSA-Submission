class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while(i < nums.length && j < nums.length){
            while(j < nums.length && nums[i] == nums[j]){
                j++;
            }
            if(j >= nums.length){
                return i+1;
            }
            nums[i+1] = nums[j];
            i++;
            j++;
        }
        return i+1;
    }
}