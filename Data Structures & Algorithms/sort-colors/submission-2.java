class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int m = 0;
        int h = nums.length - 1;
        while(m <= h){
            if(nums[m] == 0){
                int t = nums[l];
                nums[l] = nums[m];
                nums[m] = t;
                l++;
                m++;
            }
            else if(nums[m] == 2){
                int t = nums[h];
                nums[h] = nums[m];
                nums[m] = t;
                h--;
            }
            else {
                m++;
            }

        }
    }
}