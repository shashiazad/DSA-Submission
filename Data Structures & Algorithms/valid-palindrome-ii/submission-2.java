class Solution {
    boolean isPalindrom(String s, int l, int r){
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l <= r){
            if(s.charAt(l) == s.charAt(r)){
                l++;
                r--;
            }else{
                return isPalindrom(s, l+1, r) || isPalindrom(s, l, r-1);
            }
        }
        return true;
    }
}