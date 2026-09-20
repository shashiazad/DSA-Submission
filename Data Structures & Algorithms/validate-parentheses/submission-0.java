class Solution {
    public boolean isValid(String s) {
        if(s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']') return false;
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty()){
                if(st.peek() != null && st.peek() == '[' && ch == ']'){
                    st.pop();
                } else if(st.peek() != null && st.peek() == '{' && ch == '}'){
                    st.pop();
                } else if(st.peek() != null && st.peek() == '(' && ch == ')'){
                    st.pop();
                }else {
                    st.push(ch);
                }
            } else{
                st.push(ch);
            }
        }
        return st.size() == 0;
    }
}
