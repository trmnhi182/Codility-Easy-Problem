/**Write a function that, given a non-negative integer N, returns the number of digits equal to 1 in the decimal
 * representation of the number 11N. For example, given N=3 the function should return 2, because 113=1331 and two
 * digits of the number 1331 are equal to 1.
 */
public class pow11 {
    public static void main(String[] args){
        System.out.println(solution(3));
        System.out.println(solution(18));
        System.out.println(solution(0));
    }

    public static int solution(int number){
        int count=0;
        String stringValue = String.valueOf(Math.pow(11,number));
        for(int i=0; i<stringValue.length(); i++){
            if(stringValue.charAt(i) == '1') count++;
        }
        return count;
    }
}
