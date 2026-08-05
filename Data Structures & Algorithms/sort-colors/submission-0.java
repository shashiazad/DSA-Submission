class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i : nums){
            if(i == 0) zero++;
            if(i == 1) one++;
            if(i == 2) two++;
        }
        int i = 0;
        while(zero-- > 0){
            nums[i] = 0;
            i++;
        }
        while(one-- > 0){
            nums[i] = 1;
            i++;
        }
        while(two-- > 0){
            nums[i] = 2;
            i++;
        }
    }
}