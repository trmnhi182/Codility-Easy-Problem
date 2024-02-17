/**Write a function solution that, given integer N, returns the smallest non-negative integer whose individual digits
 * sum to N.
 * Examples:
 * 1. Given N = 16, the function should return 79. There are many numbers whose digits sum to 16
 * (for example: 79, 97, 808, 5551, 22822, etc.). The smallest such number is 79.
 * 2. Given N = 19, the function should return 199 (the sum of digits is 1 + 9 + 9 = 19).
 * 3. Given N = 7, the function should return 7.*/
public class smallestDigitSum {
    public static void main(String[] args){
        System.out.println(solution(16));
        System.out.println(solution(19));
        System.out.println(solution(7));
    }
    public static int solution(int n){
        return (int)((n%9+1) * Math.pow(10, Integer.parseInt(String.valueOf(n/9),10)) -1);
    }
}
