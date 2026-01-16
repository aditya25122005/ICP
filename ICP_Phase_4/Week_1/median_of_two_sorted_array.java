package ICP_Phase_4.Week_1;

public class median_of_two_sorted_array {
    public static void main(String[] args) {
        int [] nums1={1,4,5,7};
        int [] nums2={3,4,5,6,7,8};
        System.out.println(findMedianSortedArrays(nums1, nums2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

         // Always binary search on the smaller array
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }
        int m=nums1.length;
        int n= nums2.length;


        int lo=0;
        int hi=m;
        while(lo<=hi){
            // how many elements nums1 gives to LEFT part
            int cut1= lo+(hi-lo)/2;

            // remaining elements needed from nums2 for LEFT part
            int cut2= (m+n+1)/2-cut1;

            /*
            nums1: [1, 3 | 8]
            nums2: [7, 9 | 10, 11]
             */

            // border elements around the cut

            // max in left part of nums1
            int maxLeftA=(cut1==0)? Integer.MIN_VALUE : nums1[cut1-1];

            // smallest element in right part of nums1(That will Go in Right Side in answer)
            int minRightA = cut1==m? Integer.MAX_VALUE: nums1[cut1];

            // min from Right part of nums2
            int minRightB=(cut2==n)?Integer.MAX_VALUE : nums2[cut2];

            // largest from left part of nums2(that will gho in Left Side of answer)
            int maxLeftB=(cut2==0)?Integer.MIN_VALUE :nums2[cut2-1];


            //  everything on LEFT <= everything on RIGHT
            if(maxLeftA <= minRightB && maxLeftB<=minRightA){
                if((m+n)%2==0){
                    // even length -> average of middle two
                    return (Math.max(maxLeftA,maxLeftB)+ Math.min(minRightA,minRightB))/2.0;
                }
                // odd length -> median is max of LEFT side
                else{
                    return Math.max(maxLeftA,maxLeftB);
                }
            }
            // nums1 left is too big -> move cut left
            else if(maxLeftA > minRightB){
                hi=cut1-1;
            }
            // nums1 left is too small -> move cut right
            else{
                lo=cut1+1;
            }


        }
        return 0.0;
    }
}
