package Home_Assignment_8;

import java.util.ArrayList;
import java.util.List;

public class online_stock_span {
    public static void main(String[] args) {
        online_stock_span obj= new online_stock_span();
        int param_1=obj.next(0)
    }
    List<Integer> ll;
    public online_stock_span() {
        ll= new ArrayList<>();
    }
    
    public int next(int price) {
        ll.add(price);
        int n=ll.size();
        int cnt=1;
        for(int i=n-2;i>=0;i--){
            if(ll.get(i)<=price){
                cnt++;
            }
            else{
                return cnt;
            }
        }
        return cnt;
    }
}
