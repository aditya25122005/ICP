package ICP_Phase_4.Week_2;

public class stack_array_implementation {
    static class stack{
        private int [] arr;
        private int curr=-1;

        stack(int size){
            arr= new int[size];  // constructor
            curr=-1;
        }
        public  void push(int val){
            if(curr==arr.length-1){
                System.out.println("Stack is Full");
                return;
            }
            curr++;
            arr[curr]= val;
        
        }
        public int pop(){
            if(curr==-1){
                System.out.println("Stack is Empty");
            }
            return arr[curr--];
        }
        public  int peek(){
            if(curr==-1){
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[curr];
        }
        public  boolean isEmpty(){
            if(curr==-1){
                return true;
            }
            return false;
        }
    }

    public static void main(String[] args) {
        
        stack st = new stack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.isEmpty());
        System.out.println(st.pop());



    }
    
}
