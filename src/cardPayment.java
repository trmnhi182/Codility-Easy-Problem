import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**You are given a list of all the transactions on a bank account during the year 2020. The account was empty at the
 * beginning of the year (the balance was 0). Each transaction specifies the amount and the date it was executed. If the
 * amount is negative (less than 0) then it was a card payment, otherwise it was an incoming transfer (amount at least 0).
 * The date of each transaction is in YYYY−MM−DD format: for example, 2020−05−20 represents 20th May 2020.
 * Additionally, there is a fee for having a card (omitted in the given transaction list), which is 5 per month.
 * This fee is deducted from the account balance at the end of each month unless there were at least three payments made
 * by card for a total cost of at least 100 within that month.
 *
 * Your task is to compute the final balance of the account at the end of the year 2020. Write a function that, given
 * an array A of N integers representing transaction amounts and an array D of N strings representing transaction dates,
 * returns the final balance of the account at the end of the year 2020. Transaction number K
 * (for K within the range [0..N-1]) was executed on the date represented by D[K] for amount A[K].
 *
 * Examples:
 * 1. Given A = [100, 100, 100, −10] and D = ["2020−12−31", "2020−12−22", "2020−12−03", "2020−12−29"],
 * the function should return 230. Total income was equal to 100 + 100 + 100 − 10 = 290 and the fee was paid every
 * month, so 290 - (5 * 12) = 230.
 *
 * 2. Given A = [180, -50, -25, -25] and D = ["2020−01−01", "2020−01−01", "2020−01−01", "2020−01−31"], the function
 * should return 25. The income was equal to 180, the expenditure was equal to 100 and the fee was applied in every
 * month except January: 180 - 100 - (5 * 11) = 25.
 *
 * 3. Given A = [1, -1, 0, -105, 1] and D = ["2020−12−31", "2020−04−04", "2020−04−04", "2020−04−14", "2020−07−12"],
 * the function should return -164. The fee is paid every month. 1 - 1 + 0 - 105 + 1 - (5 * 12) = -164. Note that in
 * April, even though the total cost of card payments was 106 (more than 100), there were only two payments made
 * by card, so the fee was still applied. A transaction of value 0 is considered a positive, incoming transfer.
 *
 * 4. Given A = [100, 100, -10, -20, -30] and D = ["2020−01−01", "2020−02−01", "2020−02−11", "2020−02−05",
 * "2020−02−08"], the function should return 80.
 *
 * 5. Given A = [-60, 60, -40, -20] and D = ["2020−10−01", "2020−02−02", "2020−10−10", "2020−10−30"],
 * the function should return −115.*/
public class cardPayment {
    public static void main(String[] args){
        int[] amount1 ={100, 100, 100, -10};
        String[] date1={"2020-12-31", "2020-12-22", "2020-12-03", "2020-12-29"};
        System.out.println(solution(amount1, date1));

        int[] amount2 ={1, -1, 0, -105, 1};
        String[] date2={"2020-10-01", "2020-02-02", "2020-10-10", "2020-10-30"};
        System.out.println(solution(amount2, date2));
    }
    public static int solution(int[] amount, String[] date){

        int[] months = Arrays.stream(date).mapToInt(item -> Integer.parseInt(item.split("-")[1])).toArray();
        int[] countCost = new int[14];
        Arrays.fill(countCost,0);
        int[] countPayment = new int[14];
        Arrays.fill(countPayment,0);
        int balance =0;

        for(int i=0; i<amount.length; i++){
            balance +=amount[i];
            if(amount[i]<0){
                countCost[months[i]] += -(amount[i]);
                countPayment[months[i]]++;
            }
        }

        int monthCount =12;
        for(int i=1; i<13; i++){
            if(countCost[i] >=100 && countPayment[i] >=3) {monthCount--;}
        }
        return (balance -5 * monthCount);
    }
}
