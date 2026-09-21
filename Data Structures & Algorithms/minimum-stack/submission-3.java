class MinStack {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();
    public MinStack() {

    }
    
    public void push(int val) {
        if(minSt.isEmpty() || val <= minSt.peek()){
            minSt.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        //if(!st.isEmpty()){
            if(st.peek().equals(minSt.peek())){
                minSt.pop();
            }
            st.pop();
        //}
        
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
