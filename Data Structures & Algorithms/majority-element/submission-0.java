class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer>mp = new HashMap<>();
        for(int i : nums){
            mp.put(i, mp.getOrDefault(i, 0)+1);
            if(mp.get(i) > (nums.length/2)){
                return i;
            }
        }
        return mp.get(0);
    }
}