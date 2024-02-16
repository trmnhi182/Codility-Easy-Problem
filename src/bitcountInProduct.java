/**Write a function that, given two non-negative integers A and B, returns the number of bits
 * set to 1 in the binary representation of the number A * B.
 For example, given A = 3 and B = 7 the function should return 3, because the binary representation
 of A * B = 3 * 7 = 21 is10101and it contains three bits set to 1.
 Assume that:
 A and B are integers within the range [0..100,000,000].
 In your solution, focus on correctness. The performance of your solution will not be the focus of
 the assessment.*/

public class bitcountInProduct {
    public static void main(String[] args){
        System.out.println(Solution(9999999,18));
    }

    public static int Solution(int A, int B){
        int count = 0;

        if(A > 0 && B > 0) {
            int product = A*B;
            while (product > 0){
                if(product % 2 == 1)
                    count++;
                product = product/2;
            }
        }
        return count;
    }
}
