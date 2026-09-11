class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int minLen = Integer.MAX_VALUE;
        int maxSum = 0;
        for(int r = 0; r < nums.length; r++){
            maxSum += nums[r];

            while(maxSum >= target){
                minLen = Math.min(minLen, r - l + 1);
                maxSum -= nums[l];
                l++;
            }
        }
        return minLen == Integer.MAX_VALUE? 0 : minLen;
    }
}