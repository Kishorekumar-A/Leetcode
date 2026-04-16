class MyQueue {

    Queue<Integer> qu=new LinkedList<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
        qu.offer(x);
    }
    
    public int pop() {
        return qu.poll();
    }
    
    public int peek() {
        return qu.peek();
    }
    
    public boolean empty() {
        return qu.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */