/**Write a function that, given an array A consisting of N integers, returns the maximum among all integers which
 * are multiples of 4.
 * For example, given array A as follows: [-6, -91, 1011, -100, 84, -22, 0, 1, 473] the function should return 84.*/
public class arrayFilterVarOpal {
    public static void main(String[] args){
        int[] a = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        int[] b = {18, -81, 2001, -100, 104, -22, 0, 1, 473};
        int[] c = {0};
        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
    }
    public static int solution(int[] array){
        int max = 0;
        for(int i : array){
            if(i%4==0){
                if(i > max) max = i;
            }
        }
        return max;
    }
}
