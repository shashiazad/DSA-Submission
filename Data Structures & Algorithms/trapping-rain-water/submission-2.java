class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int lMax = 0;
        int rMax = 0;
        int water = 0;
        int l = 0;
        int r = n - 1;
        while (l <= r){
            if(height[l] <= height[r]){
                if(height[l] >= lMax){
                    lMax = height[l];
                }else{
                    water += lMax - height[l];
                }
                l++;
            }
            else{
                if(height[r] >= rMax){
                    rMax = height[r];
                }else{
                    water += rMax - height[r];
                }
                r--;
            }
        }
        return water;
    }
}
