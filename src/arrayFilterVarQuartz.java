/**Write a function that, given an array A consisting of N integers, returns the maximum among all integers which are
 * multiples of 3.
 * For example, given array A as follows: [-6, -91, 1011, -100, 84, -22, 0, 1, 473] the function should return 1011.*/
public class arrayFilterVarQuartz {
    public static void main(String[] args){
        int[] a ={-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        System.out.println(solution(a));
    }
    public static int solution(int[] array){
        int max = 0;
        for(int i:array){
            if(i%3==0) {
                if (i > max) {
                    max = i;
                }
            }

        }
        return max;
    }
}
