class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int water = 0;
        Arrays.fill(leftMax, 0);
        Arrays.fill(rightMax, 0);
        int lMax = 0;
        int rMax = 0;
        for(int i = 0; i < n; i++){
            lMax = Math.max(lMax, height[i]);
            leftMax[i] = lMax;
        }
        for(int i = n - 1; i >= 0; i--){
            rMax = Math.max(rMax, height[i]);
            rightMax[i] = rMax;
        }
        for(int i : leftMax){
            System.out.print(" "+ i);
        }
        for(int i = 1; i < n; i++){
            if(i-1 >= 0 && i+1 < n){
                if(Math.min(leftMax[i-1], rightMax[i+1]) - height[i] > 0){
                    water += Math.min(leftMax[i-1], rightMax[i+1]) - height[i];
                }
            }
        }
        return water;
    }
}
