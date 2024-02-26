import java.util.HashMap;
import java.util.Map;

/**
 * An online shop sells T-shirts of three sizes: S (small), M (medium) and L (large).
 * Write a function solution that, given a string T of length N containing letters S, M and L, returns a sorted
 * string T by T-shirt sizes from the smallest to the largest.
 * Examples:
 * 1. Given T = "MSSLS", the function should return "SSSML".
 * 2. Given T = "LLMS", the function should return "SMLL".
 * 3. Given T = "SMS", the function should return "SSM".*/
public class sortingShirts {
    public static void main(String[] args){
        String a = "MSSLS";
        String b = "LLMS";
        String c = "SMS";

        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
    }


    public static String solution(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char[] result = new char[s.length()];
        int index = 0;
        for (char size : new char[]{'S', 'M', 'L'}) {
            while (map.containsKey(size) && map.get(size) > 0) {
                result[index++] = size;
                map.put(size, map.get(size) - 1);
            }
        }

        return new String(result);
    }
}
