import java.util.HashMap;

/**A string S made of uppercase English letters is given. In one move, six letters forming the
 * word "BANANA" (one 'B', three 'A's and two 'N's) can be deleted from S. What is the maximum number
 * times such a move can be applied to S?
 Write a function that, given a string S of length N, returns the maximum number of moves that can be
 applied.
 */
public class countBananas {
    public static void main(String[] args){
        System.out.println(solution("NAABXXAN"));
        System.out.println(solution("NAANAAXNABABYNNBZ"));
        System.out.println(solution("QABAAAWOBL"));
    }
    public static int solution(String s){
        int countB = 0, countA = 0, countN = 0;
        for (char letter : s.toCharArray()) {
            switch (letter) {
                case 'B':
                    countB++;
                    break;
                case 'A':
                    countA++;
                    break;
                case 'N':
                    countN++;
                    break;
            }
        }
        return Math.min(countB, Math.min(countA / 3, countN / 2));
    }
}
