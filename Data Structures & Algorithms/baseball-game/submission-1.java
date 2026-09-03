class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(String s : operations){
            if(s.equals("D") && !st.isEmpty()){
                int x = st.peek();
                st.push(x* 2);
            } else if(s.equals("C") && !st.isEmpty()){
                st.pop();
            }else if(s.equals("+")){
                int x = st.pop();
                int y = st.peek();
                st.push(x);
                st.push(x+y);
            } else{
                st.push(Integer.parseInt(s));
            }
        }
        int res = 0;
        while(!st.isEmpty()){
            res += st.pop();
        }
        return res;
    }
}