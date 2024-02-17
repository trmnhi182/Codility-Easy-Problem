/**
 Write a function solution that, given an array A of N integers (between −100 and 100), returns the sign (−1, 0, 1) of
 the product of all the numbers in the array multiplied together. Assume that N is between 1 and 1000.
 For example, given A = [1, −2, −3, 5], the function should return 1 (the multiplication equals 30).
 Given A = [1, 2, 3, −5] your function should return −1 (the multiplication equals −30).
 Given A = [1, 2, 0, −5] your function should return 0 (the multiplication equals 0).*/
public class signum {
    public static void main(String[] args){
        int[] a ={1,2,3,4};
        int[] b ={1,8,0,2};
        int[] c ={-6,-4,2,-18};
        int[] d ={-1,2,-3,4,5,-6,-7};

        System.out.println(solution(a));
        System.out.println(solution(b));
        System.out.println(solution(c));
        System.out.println(solution(d));

    }
    public static int solution(int[] array){
        int negativeCount =0;
        for(int i=0; i<array.length; i++){
            if(array[i] == 0) {
                return 0;
            }else if(array[i]<0){
                negativeCount++;
            }
        }

        if(negativeCount%2==0){
            return 1;
        }else{
            return -1;
        }
    }
}
