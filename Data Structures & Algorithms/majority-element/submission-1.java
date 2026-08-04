class Solution {
    public int majorityElement(int[] nums) {
        //approach 1 Time: O(n) Space: O(n)
        // Map<Integer, Integer>mp = new HashMap<>();
        // for(int i : nums){
        //     mp.put(i, mp.getOrDefault(i, 0)+1);
        //     if(mp.get(i) > (nums.length/2)){
        //         return i;
        //     }
        // }
        //approach 2 Time: O(n log n)
        // Arrays.sort(nums);
        // return nums[nums.length/2];
        //approach 3 Time: O(n) Space: O(1)
        int mj = 0;
        int c = 0;
        for(int i : nums){
            if(c == 0){
                mj = i;
            }

            if(i == mj){
                c++;
            }else{
                c--;
            }
        }
        return mj;
    }
}