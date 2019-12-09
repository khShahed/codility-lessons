// https://app.codility.com/demo/results/training742WXC-JDC/
class Solution {
    public int solution(int[] A) {
        boolean[] track = new boolean[A.length+1];

        for (int index = 0; index<A.length; index++){
            if (A[index] > A.length || track[A[index]-1])
                return 0;
            else {
                track[A[index]-1] = true;
            }
        }

        for (int index = 0; index < A.length; index++) {
            if (!track[index])
                return 0;
        }

        return 1;
    }
}