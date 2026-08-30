class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int[] arr = new int[9];
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(mp.containsKey(nums[i])){
                if(Math.abs(i - mp.get(nums[i])) <= k){
                    System.out.println(nums[i] +" "+mp.get(nums[i]));
                    return true;
                }
            }
            mp.put(nums[i], i);
        }
        
        return false;
    }
}