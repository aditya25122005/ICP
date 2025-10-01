package Home_Assignment_5;

import java.util.Arrays;

public class Min_Number_of_arrows_to_burst_balloons {
    public static void main(String[] args) {
        int [][] points = {{10,16},{2,8},{1,6},{7,12}};
        System.out.println(findMinArrowShots(points));
    }
    public static int findMinArrowShots(int[][] points) {
        int cnt=1;
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int last=points[0][1];
        for(int i=1;i<points.length;i++){
            if(points[i][0]>last){
                cnt++;
                last=points[i][1];
            }
        }
        return cnt;
    }
}
