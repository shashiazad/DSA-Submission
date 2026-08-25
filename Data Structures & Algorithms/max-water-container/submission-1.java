class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int maxWater = Integer.MIN_VALUE;
        while(l < r){
            int water = Math.min(heights[l], heights[r]) * Math.abs(r-l);
            maxWater = Math.max(water, maxWater);
            if(heights[l] < heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxWater;
    }
}
