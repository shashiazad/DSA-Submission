class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false;
        int win = s1.length();
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(char ch : s1.toCharArray()){
            freq1[ch - 'a']++;
        }
        for(int i = 0; i < win; i++){
            freq2[s2.charAt(i) - 'a']++;
        }

        if(Arrays.equals(freq1, freq2)) return true;

        for(int r = win; r < s2.length(); r++){
            int l = r - win;
            freq2[s2.charAt(l) - 'a']--; //remove left char from window
            freq2[s2.charAt(r) - 'a']++; //add next char to window

            if(Arrays.equals(freq1, freq2)){
                return true;
            }
        }

        return false;
    }
}
