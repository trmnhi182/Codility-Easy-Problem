/**A non-empty array A consisting of N integers is given. The amplitude of this array is defined as the largest possible
 * difference between two of its elements, i.e.: amplitude(A) = max{A[P] −A[Q] : 0 ≤ P, Q < N } Write a function that,
 * given a non-empty array A consisting of N integers, returns its amplitude. For example, given array A such that:
 A[0] = 10
 A[1] = 2
 A[2] = 44
 A[3] = 15
 A[4] = 39
 A[5] = 20
 the function should return 42.*/
public class amplitude {
    public static void main(String[] args){
        int[] a={10,2,44,15,39,20};
        System.out.println(solution(a));
    }
    public static int solution(int[] numbers){
        int min = numbers[0];
        int max = numbers[0];
        for(int i=0; i<numbers.length-1; i++){
            min = Math.min(min, numbers[i]);
            max = Math.max(max,numbers[i]);
        }

        return max - min;
    }
}
