class Solution {
    public String addBinary(String a, String b) {
        int al = a.length() - 1;
        int bl = b.length() - 1;
        int carry = 0;
        StringBuilder bin = new StringBuilder();
        while(al >= 0 || bl >= 0 || carry != 0){
            int sum = carry;
            if(al >= 0){
                sum += (a.charAt(al) - '0');
                al--;
            }
            if(bl >= 0){
                sum += (b.charAt(bl) - '0');
                bl--;
            }
            bin.append(sum%2);
            carry = sum / 2;
        }
        return bin.reverse().toString();
    }
}