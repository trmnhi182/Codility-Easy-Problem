/**A rectangle is called rectilinear if its edges are all parallel to coordinate axes. Such a rectangle can be described
 * by specifying the coordinates of its bottom-left and top-right corners. Write a function that, given eight integers
 * representing two rectilinear rectangles (one with lower-left corner (K, L) and upper-right corner (M, N), and another
 * with lower-left corner (P, Q) and upper-right corner (R, S)), returns the area of their intersection.
 * The function should return 0 if the intersection is a point or a line segment, or if the rectangles do not intersect.
 * The function should return −1 if the area of the intersection exceeds 2,147,483,647.
 For example, given integers:
 K = 0    L = 2    M = 5     N = 10
 P = 3    Q = 1    R = 20    S = 15
 the function should return 16.*/
public class areaOfIntersection {
    public static void main(String[] args){
        System.out.println(solution(0,2,5,10,3,1,20,15));
    }
    public static int solution(int K, int L, int M, int N, int P, int Q, int R, int S){
        int left = Math.max(K, P);
        int right = Math.min(M, R);
        int bottom = Math.max(L, Q);
        int top = Math.min(N, S);

        if (left < right && bottom < top) return (right - left) * (top - bottom);
        if ((right-left)*(top-bottom) > 2147483647) return -1;
        return 0;
    }
}
