/**Write a function solution that, given a string S consisting of N characters, returns the maximum number of
 * letters 'a' that can be inserted into S (including at the front and end of S) so that the resulting string doesn't
 * contain three consecutive letters 'a'. If string S already contains the substring "aaa", then your function should
 * return −1.
 *  Examples:
 *  1. Given S = "aabab", the function should return 3, because a string "aabaabaa" can be made.
 *  2. Given S = "dog", the function should return 8, because a string "aadaaoaagaa" can be made.
 *  3. Given S = "aa", the function should return 0, because no longer string can be made.
 *  4. Given S = "baaaa", the function should return −1, because there is a substring "aaa".*/


public class insertMaxA {
    public static void main(String[] args){
        System.out.println(solution("aabab"));
        System.out.println(solution("dog"));
        System.out.println(solution("aa"));
        System.out.println(solution("baaaa"));

    }

    public static int solution(String s){
        int maxConsecutiveAs = 2;
        int consecutiveAs =0;
        int result =0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                consecutiveAs++;
                if(consecutiveAs>maxConsecutiveAs){
                    return -1;
                }
            }else{
                result+= (maxConsecutiveAs - consecutiveAs);
                consecutiveAs=0;
            }
        }

        return result += (maxConsecutiveAs - consecutiveAs);
    }
}
