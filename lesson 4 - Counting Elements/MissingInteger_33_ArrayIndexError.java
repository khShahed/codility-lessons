// https://app.codility.com/demo/results/training87GCQJ-CHK/

class Solution {
    public int solution(int[] A) {
        int smallestNumber = 1;
        boolean[] tracking = new boolean[A.length+2];
        for (int index = 0; index < A.length; index++) {
            if (A[index] > 0) tracking[A[index]] = true;
        }

        for (int index = 1; index<tracking.length; index++) {
            if (!tracking[index]) {
                smallestNumber = index;
                break;
            }
        }

        return smallestNumber;
    }
}