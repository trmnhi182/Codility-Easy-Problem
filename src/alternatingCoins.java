/**There are N coins, each showing either heads or tails. We would like all the coins to form a sequence of alternating
 * heads and tails. What is the minimum number of coins that must be reversed to achieve this?
 Write a function that, given an array A consisting of N integers representing the coins, returns the minimum number of
 coins that must be reversed. Consecutive elements of array A represent consecutive coins and contain either a 0
 (heads) or a 1 (tails).*/
public class alternatingCoins {
    public static void main(String[] args){
        int[] a={1, 0, 1, 0, 1, 1};
        int[] b={1, 1, 0, 1, 1};
        int[] c={0, 1, 0};
        int[] d={0, 1, 1, 0};

        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
        System.out.println(solution(d));
    }
    public static int solution(int[] coins){
        int flips = 0;
        boolean changeNeeded = false;
        int[] sequence = new int[coins.length];

        // Copy all elements from the incoming array
        for (int i = 0; i < coins.length; i++) {
            sequence[i] = coins[i];
        }

        // Count the array, avoiding indexOutOfBounds errors
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] == sequence[i + 1]) {
                // Compare current to next entry
                flips++; // Increment a flip
                changeNeeded = true; // Indicate that a digit needs to be changed
            }

            if (sequence[i] == 1 && changeNeeded) {
                // Change a 1 to a 0
                sequence[i] = 0;
                changeNeeded = false; // Reset our change detection
            } else if (sequence[i] == 0 && changeNeeded) {
                // Change a 0 to a 1
                sequence[i] = 1;
                changeNeeded = false; // Reset our change detection
            }
        }

        // Check the 0th index (the loop above skips it)
        if (sequence[0] == sequence[1]) {
            flips++; // If checked within the loop, it would add an extra, unnecessary flip
        }

        return flips;
    }
}
