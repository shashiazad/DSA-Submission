class Solution {
    public String minWindow(String s, String t) {
        if(t.length() == 0) return "";
        Map<Character, Integer> countT = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for(char c : t.toCharArray()){
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }
        int have = 0;
        int need = countT.size();
        int left = -1;
        int right = -1;
        int resLen = Integer.MAX_VALUE;

        int l = 0;
        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);
            if(countT.containsKey(c) && window.get(c).equals(countT.get(c))){
                have++;
            }
            while(have  == need){
                if((r - l + 1) < resLen){
                    left = l;
                    right = r;
                    resLen = r - l + 1;
                }
                window.put(s.charAt(l), window.getOrDefault(s.charAt(l), 0) - 1);
                if(countT.containsKey(s.charAt(l)) && window.get(s.charAt(l)) < countT.get(s.charAt(l))){
                    have--;
                }
                l++;
            }
        }
        if(resLen != Integer.MAX_VALUE){
            return s.substring(left, right+1);
        }
        return "";
    }
}
