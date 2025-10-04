package Home_Assignment_6;

import java.util.*;

public class combinations {
    public static void main(String[] args) {
        int n=4;
        int k=2;
        List<List<Integer>> ll= new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        Solve(n,k,ll,inner,1);
        System.out.println(ll);
    }
    public static void Solve(int n, int k,List<List<Integer>> ll,List<Integer> inner,int idx){
        if(inner.size()==k){
            ll.add(new ArrayList<>(inner));
            return;
        }
        for(int i=idx;i<=n;i++){
            inner.add(i);
            Solve(n,k,ll,inner,i+1);
            inner.remove(inner.size()-1);
        }
        
    }
}
