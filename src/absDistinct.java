/**A non-empty array A consisting of N numbers is given. The array is sorted in non-decreasing order. The absolute
 * distinct count of this array is the number of distinct absolute values among the elements of the array.
 * For example, consider array A such that:
 A[0] = -5
 A[1] = -3
 A[2] = -1
 A[3] =  0
 A[4] =  3
 A[5] =  6
 The absolute distinct count of this array is 5, because there are 5 distinct absolute values among the elements of
 this array, namely 0, 1, 3, 5 and 6.
 Write a function that, given a non-empty array A consisting of N numbers, returns absolute distinct count of array A.*/
public class absDistinct {
    public static void main(String[] args){
        int[] a={-5,-3,-1,0,3,6};
        int[] b={0,0,0,0,0,0};
        int[] c={1,-1};
        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
    }
    public static int solution(int[] array){
        int count=0;
        for(int i=0; i<array.length-1; i++){
            if(Math.abs(array[i]) != Math.abs(array[i+1])) count++;
        }
        return count;
    }
}
