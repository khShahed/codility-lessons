// https://app.codility.com/demo/results/trainingJPPKX5-FHQ/

class Solution {
    public int solution(int[] A) {
        int[] sumFromFirst = new int[A.length];
        int[] sumFromLast = new int[A.length];
        int totalSumFromFirst = 0, totalSumFromLast = 0;
        int lowestDiff = Integer.MAX_VALUE;

        for (int first = 0, last = A.length - 1; first < A.length; first++, last--) {
            totalSumFromFirst += A[first];
            sumFromFirst[first] = totalSumFromFirst;

            totalSumFromLast += A[last];
            sumFromLast[last] = totalSumFromLast;
        }

        for (int index=0; index < A.length - 1; index++) {
            int difference = Math.abs(sumFromFirst[index] - sumFromLast[index + 1]);
            if (difference < lowestDiff) {
                lowestDiff = difference;
                if (lowestDiff == 0)
                    break;
            }
        }

        return lowestDiff;
    }
}