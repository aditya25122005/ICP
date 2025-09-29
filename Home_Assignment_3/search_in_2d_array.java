package Home_Assignment_3;

public class search_in_2d_array {
    public static void main(String[] args) {
      int[][]  matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
      System.out.println(searchMatrix(matrix, 7));
    }

public static boolean searchMatrix(int[][] matrix, int target) {
        int n= matrix.length;
        int m= matrix[0].length;
        int i=0;
        int j=m-1;
        while(i<n && j>=0){

        if(matrix[i][j]==target){
            return true;
        }else if(target>matrix[i][j]){
            i++;
        }else{
            j--;
        }
        }
        return false;
    }

}