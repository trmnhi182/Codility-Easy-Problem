/**
 * Players X and O are playing a game consisting of N rounds. A player wins the whole game if they win any three rounds
 * in a row, and their opponent does not. If neither or both players manage to win three rounds in a row, there is a tie.
 * Note that the total number of rounds a player has won does not matter.
 * Write a functio which, given a string S of length N consisting only of letters "X" and "O", determines the winner of
 * the game. Return "X" if player X won the game, "O" if player O won the game, or "tie" if there was a tie.
 * Examples:
 * 1. Given S = "OXXXOXOOX", your function should return "X". Only player X managed to win three consecutive rounds (2, 3 and 4).
 * 2. Given S = "XOXXXOOOXOOO", your function should return "tie". Both players managed to win three rounds in a row
 * (X won rounds 3, 4, 5 and O won rounds 6, 7, 8 and 10, 11, 12).
 * 3. Given S = "XX", your function should return "tie" since no player won three rounds in a row.
 * 4. Given S = "XXOOOOOXX", your function should return "O". Only player O won three rounds in a row.
 */
public class xoGame {
    public static void main(String[] args) {
        System.out.println(solution("OXXXOXOOX"));
        System.out.println(solution("XOXXXOOOXOOO"));
        System.out.println(solution("XX"));
        System.out.println(solution("XXOOOOOXX"));
    }

    public static String solution(String s) {
        String result = "tie";
        int xStreak = 0;
        int oStreak = 0;
        int countWinX = 0;
        int countWinO = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                xStreak += 1;
                oStreak = 0;
            }
            if (s.charAt(i) == 'O') {
                oStreak += 1;
                xStreak = 0;
            }

            if (xStreak >= 3) {
                countWinX++;
            } else if (oStreak >= 3) {
                countWinO++;
            }

            if (countWinX >= 1 || countWinO >= 1) result = "tie";
            if (countWinX >= 1 && countWinO < 1) {
                result = "X";
            } else if (countWinO >= 1 && countWinX < 1) {
                result = "O";
            }
        }

        return result;
    }
}
