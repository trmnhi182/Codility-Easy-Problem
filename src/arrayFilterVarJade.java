import java.util.ArrayList;
import java.util.Collections;

/**Write a function that, given an array A consisting of N integers, returns the maximum among all one-digit integers.
 * For example, given array A as follows: [-6, -91, 1011, -100, 84, -22, 0, 1, 473] the function should return 1.*/
public class arrayFilterVarJade {
    public static void main(String[] args){
        int[] a ={-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        int[] b ={1,-8,18,0,2,-6,4,6434};
        System.out.println(solution(a));
        System.out.println(solution(b));
    }
    public static int solution(int[] array){
        ArrayList<String> list = new ArrayList<>();

        for(int i=0; i<array.length; i++){
            String stringValue = String.valueOf(array[i]);
            if(stringValue.length() == 1){
                list.add(stringValue);
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        return Integer.parseInt(list.get(0));


    }
}
