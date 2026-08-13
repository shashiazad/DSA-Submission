class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int i : nums){
            st.add(i);
        }
        int longest = 0;
        for(int i : nums){
            int c = 1;
            if(!st.contains(i-1)){
                while(!st.isEmpty() && st.contains(i+1)){
                    c++;
                    i++;
                }
            }
            longest = Math.max(longest, c);
        }
        return longest;
    }
}
