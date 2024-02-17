/**A non-empty array A consisting of N integers is given. A slice of that array is a pair of integers (P, Q) such that
 * 0 ≤ P ≤ Q < N. Integer P is called the beginning of the slice; integer Q is called the end of the slice.
 * The number Q - P + 1 is called the size of the slice. A slice (P, Q) of array A is called ascending if the
 * corresponding items form a strictly increasing sequence: A[P] < A[P+1] < ... < A[Q−1] < A[Q].
 * Note that we consider a slice (P, P) consisting of one element to be ascending. For example, consider array A such that:
 A[0] = 2
 A[1] = 2
 A[2] = 2
 A[3] = 2
 A[4] = 1
 A[5] = 2
 A[6] = -1
 A[7] = 2
 A[8] = 1
 A[9] = 3
 Pair (0, 3) is a slice of array A of size 4 that is not ascending. Pair (2, 2) is a slice of size 1 that is ascending.
 Pair (4, 5) is a slice of size 2 that is ascending. Pairs (6, 7) and (8, 9) are other slices of size 2 that are ascending.
 There is no slice of array A that is ascending and has size greater than 2.

 Write a function that, given an array A consisting of N integers, returns the beginning of any ascending slice of A of
 maximal size. For instance, in the above example the function may return 4, 6 or 8 as explained above. For the following
 array A consisting of N = 3 elements:
 A[0] = 30
 A[1] = 20
 A[2] = 10
 the function may return 0, 1 or 2, because all ascending slices of this array have size 1.*/
public class monotone {
    public static void main(String[] args){
        int[] a ={2,2,2,2,1,2,-1,2,1,3};
        int[] b={30,20,10};

        System.out.println(solution(a));
        System.out.println(solution(b));
    }

    public static int solution(int[] array){
        int maxSize = 1;
        int maxStart = 0;
        int currentSize =1;
        int currentStart =0;

        for(int i = 1; i<array.length; i++){
            if(array[i] > array[i-1]){
                currentSize++;
            }else{
                if(currentSize >= maxSize){
                    maxSize = currentSize;
                    maxStart = currentStart;

                }
                currentSize = 1;
                currentStart = i;
            }
        }

        if(currentSize >= maxSize){
            maxStart = currentStart;
        }

        return maxStart;
    }
}
