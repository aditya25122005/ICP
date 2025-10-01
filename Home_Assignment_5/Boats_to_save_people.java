package Home_Assignment_5;
import java.util.Arrays;

public class Boats_to_save_people {
    public static void main(String[] args) {
        int[] people={1,2};
        int limit=3;
        System.out.println(numRescueBoats(people, limit));
    }
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left=0;
        int right=people.length-1;
        int boat=0;
        while(left<=right){
            if(people[left]+people[right]<=limit) left++;
            right--;
            boat++;
        }
        return boat;
    }
}
