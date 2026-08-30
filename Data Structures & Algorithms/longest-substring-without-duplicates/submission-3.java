class Solution {
    public int lengthOfLongestSubstring(String s) {
        //if(s.length() == 1) return 1;
        int l = 0;
        int r = 0;
        int maxLen = 0;
        Set<Character> st = new HashSet<>();
        while(r < s.length()){
            while(st.contains(s.charAt(r))){
                st.remove(s.charAt(l));
                l++;
            }
            st.add(s.charAt(r));
            maxLen = Math.max(maxLen, (r - l + 1));
            r++;
        }
        return maxLen;
    }
}
