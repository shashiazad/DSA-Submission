class Solution {
    public int subarraySum(int[] nums, int k) {
       int prefix = 0;
       int count = 0;
       Map<Integer, Integer> mp = new HashMap<>();
       mp.put(0, 1);
       for(int i : nums){
            prefix += i;
            int remove = prefix - k;
            if(mp.containsKey(remove)){
                count += mp.get(remove);
            }
            mp.put(prefix, mp.getOrDefault(prefix, 0)+1);
       }
       return count;
    }
}