class MinStack {

    private Stack<Integer>s1;
    private Stack<Integer>s2;
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int val) {
        if(s2.isEmpty() || s2.peek()>= val){
                s2.push(val);
        }
        s1.push(val);
    }
    
    public void pop() {
        if(s1.isEmpty()){
            return;
        }
        if(!s2.isEmpty() && s1.peek().equals(s2.peek())){
            s2.pop();
        }
        s1.pop();
    }
    
    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        if(s2.isEmpty()){
            return -1;
        }
        return s2.peek();
    }
}
