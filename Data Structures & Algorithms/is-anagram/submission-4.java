class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> smp = new HashMap<>();
        for(char ch : s.toCharArray()){
            smp.put(ch, smp.getOrDefault(ch, 0) + 1);
        }
        for(char ch : t.toCharArray()){
            if(smp.getOrDefault(ch, 0) > 0){
                smp.put(ch, smp.getOrDefault(ch, 0) - 1);
            }else{
                return false;
            }
        }
        return true;
    }
}
