/**There is a road consisting of N segments, numbered from 0 to N-1, represented by a string S. Segment S[K] of the
 * road may contain a pothole, denoted by a single uppercase "X" character, or may be a good segment without any potholes,
 * denoted by a single dot, ".".
 * For example, string ".X..X" means that there are two potholes in total in the road: one is located in segment S[1]
 * and one in segment S[4]. All other segments are good.
 * The road fixing machine can patch over three consecutive segments at once with asphalt and repair all the potholes
 * located within each of these segments. Good or already repaired segments remain good after patching them.
 * Your task is to compute the minimum number of patches required to repair all the potholes in the road.
 * Write a function that, given a string S of length N, returns the minimum number of patches required to repair all the
 * potholes.*/
public class asphaltPatches {
    public static void main(String[] args){
        System.out.println(solution(".X..X"));
        System.out.println(solution("XXXX.X....X....X"));
        System.out.println(solution("XXXX"));
    }
    public static int solution(String s){
        int potholes = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'X'){
                potholes++;
                i+=2;
            }
        }
        return potholes;
    }
}
