class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String s : tokens) {
            switch (s) {
                case "+" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b + a);
                }
                case "-" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b - a);
                }
                case "*" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(a * b);
                }
                case "/" -> {
                    int a = st.pop();
                    int b = st.pop();
                    st.push(b / a);
                }
                default -> st.push(Integer.parseInt(s));
            }
        }

        return st.peek();
    }
}
