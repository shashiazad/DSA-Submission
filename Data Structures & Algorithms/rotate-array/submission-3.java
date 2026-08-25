class Solution {
    static void swap(int[] nums, int l, int r){
        int tmp = nums[l];
        nums[l] = nums[r];
        nums[r] = tmp;
    }
    public void rotate(int[] nums, int k) {
        int l = 0;
        k = k % nums.length;
        int r = nums.length - 1;
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
        l = 0;
        r = k -1;
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
        l = k;
        r = nums.length - 1;
        while(l < r){
            swap(nums, l, r);
            l++;
            r--;
        }
    }
}