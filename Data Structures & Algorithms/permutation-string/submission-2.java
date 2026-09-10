class Solution {
    static boolean areSame(char[] s1, char[] s2){
        Arrays.sort(s2);
        for(int i = 0; i < s1.length; i++){
            if(s1[i] != s2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        for(int i = 0; i <= s2.length() - s1.length(); i++){
             if(areSame(chars, s2.substring(i, i + s1.length()).toCharArray())){
                return true;
             }
        }
        return false;
    }
}
