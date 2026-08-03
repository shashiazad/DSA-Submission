class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str = "";
        String ref = strs[0];
        for(int i = 0; i < ref.length(); i++){
            for(String s : strs){
                if(s.length() < i+1 || ref.charAt(i) != s.charAt(i)){
                    return str;
                }
            }
            str += ref.charAt(i);
        }
        return str;
    }
}