class Solution {
    public boolean isAlphaNumeric(char c){
        return (c >= '0' && c <= '9') ||
                (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z');
    }
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while(l < r){
            char lChar = s.charAt(l);
            char rChar = s.charAt(r);
            if(isAlphaNumeric(lChar) == false){
                l++;
                continue;
            }
            if(isAlphaNumeric(rChar) == false){
                r--;
                continue;
            }
            if(Character.toLowerCase(lChar) != Character.toLowerCase(rChar)){
                System.out.println(lChar +" "+rChar);
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
