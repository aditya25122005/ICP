package Home_Assignment_2;
import java.util.PriorityQueue;

public class kth_largest_element_in_the_array {
    public static void main(String[] args) {
       int[] nums = {3,2,1,5,6,4};
       int k=2;
       System.out.println(Find(nums, k));
    }
    // O(N logN)
    public static int find(int[] nums, int k){
        PriorityQueue <Integer> pq= new PriorityQueue<>((a,b)->Integer.compare(b,a));
        for(int num:nums) pq.add(num);

        for(int i=0;i<k-1;i++){
            pq.poll();
        }
        return pq.poll();

    }
    // O(N log K)
    public static int Find(int [] nums, int k){
        PriorityQueue <Integer> pq= new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(nums[i]);
        }
        for(int i=k;i<nums.length;i++){
            if(nums[i]>pq.peek()){
                pq.poll();
                pq.add(nums[i]);
            }
        }
        return pq.peek();
    }
}
