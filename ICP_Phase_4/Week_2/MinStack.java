package ICP_Phase_4.Week_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {
    List<Integer> ll;
    Stack<Integer> min;


    public MinStack() {
        ll= new ArrayList<>();
        min= new Stack<>();
        min.push(Integer.MAX_VALUE);

    }
    
    public void push(int val) {
        if(val < min.peek()){
            min.push(val);
        }
        else{
            min.push(min.peek());
        }
        ll.add(val);
    }
    
    public void pop() {

        ll.remove(ll.size()-1);
        min.pop();
  
        
    }
    
    public int top() {
        return ll.get(ll.size()-1);
    }
    
    public int getMin() {
        return min.peek();
    }
}
