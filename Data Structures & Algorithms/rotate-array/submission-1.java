class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length - 1;
        while(k > 0){
            int tmp = nums[n];
            for(int i = n; i > 0; i--){
                nums[i] = nums[i-1];
            }
            nums[0] = tmp;
            k--;
        }
    }
}