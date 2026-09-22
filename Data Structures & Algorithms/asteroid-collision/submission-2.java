class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int ast : asteroids){
            boolean destroyed = false;
            while(!st.isEmpty() && st.peek() > 0 && ast < 0){
                if(st.peek() < Math.abs(ast)){
                    st.pop();
                    continue;
                }else if(st.peek() == Math.abs(ast)){
                    st.pop();
                    destroyed = true;
                    break;
                }else{
                    destroyed = true;
                    break;
                }
            }
            if(!destroyed){
                st.push(ast);
            }
        }
        int[] res = new int[st.size()];
        int i = st.size()-1;
        while(!st.isEmpty()){
            res[i] = st.pop();
            i--;
        }
        
        return res;
    }
}