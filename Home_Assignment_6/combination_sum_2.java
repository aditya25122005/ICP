package Home_Assignment_6;
import java.util.*;
public class combination_sum_2 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target=8;
        Arrays.sort(candidates);
        List<List<Integer>> ll= new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        Solve(candidates,target,ll,inner,0);
        System.out.println(ll);
        
    }
    public static void Solve(int[] arr, int target,List<List<Integer>> ll, List<Integer> inner,int idx){
        if(target==0){
            ll.add(new ArrayList<>(inner));
            return;
        }
        for(int i=idx;i<arr.length;i++){
            
            if(arr[i]<=target){
                if(i!=idx && arr[i-1]==arr[i]){
                    continue;
                }
                
                inner.add(arr[i]);
                Solve(arr,target-arr[i],ll,inner,i+1);
                inner.remove(inner.size()-1);
            }
        }
    }
}
