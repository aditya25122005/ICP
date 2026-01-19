package ICP_Phase_4.Week_2;
public class stack_implementation_LinkedList {
    static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    private ListNode top;

    // constructor
    stack_implementation_LinkedList(){
        top=null;
    }
    public void push(int v){
        ListNode n= new ListNode(v);
        n.next=top;
        top=n;
    }
    public  int pop(){
        if(top==null){
            System.out.println("Stack is Empty");
            return -1;
        }
        int ans= top.val;
        ListNode nxt= top.next;

        top= nxt;
        return ans;
    }
    public  int peek(){
        if(top==null){
            System.out.println("Stack is Empty");
            return -1;
        }
        return top.val;
    }
    public  boolean isEmpty(){
        return top==null;
    }

    public static void main(String[] args) {
        stack_implementation_LinkedList st= new stack_implementation_LinkedList();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
    }
}
