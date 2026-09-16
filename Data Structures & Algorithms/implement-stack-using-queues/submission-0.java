class MyStack {

    private Queue<Integer> q1 = new ArrayDeque<>();
    private Queue<Integer> q2 = new ArrayDeque<>();

    public MyStack() {
    }
    
    public void push(int x) {
        if(!q2.isEmpty()){
            q1.add(q2.poll());
        }
        q2.add(x);
    }
    
    public int pop() {
        int ele = q2.poll();
        while(!q1.isEmpty()){
            q2.add(q1.poll());
        }
        while(q2.size() > 1){
            q1.add(q2.poll());
        }
        return ele;
    }
    
    public int top() {
        return q2.peek();
    }
    
    public boolean empty() {
        return q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */