class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int longest = 1;
        Set<Integer> st = new HashSet<>();
        for(int i : nums){
            st.add(i);
        }

        for(int i : st){
            int cnt = 1;
            int start = i;
            if(!st.contains(start-1)){
                while(st.contains(start+1)){
                    cnt++;
                    start++;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}
