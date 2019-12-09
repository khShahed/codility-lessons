import java.util.HashMap;
// https://app.codility.com/demo/results/trainingPRDATJ-M46/
class Solution {
    public int solution(int[] A) {
        HashMap<Integer, Integer> sumFromFirst = new HashMap<>();
        HashMap<Integer, Integer> sumFromLast = new HashMap<>();
        int totalSumFromFirst = 0, totalSumFromLast = 0;
        int lowestDiff = Integer.MAX_VALUE;

        for (int first = 0, last = A.length - 1; first < A.length; first++, last--) {
            totalSumFromFirst += A[first];
            sumFromFirst.put(first, totalSumFromFirst);

            totalSumFromLast += A[last];
            sumFromLast.put(last, totalSumFromLast);
        }

        for (int index=0; index < A.length - 1; index++) {
            int difference = Math.abs(sumFromFirst.get(index) - sumFromLast.get(index + 1));
            if (difference < lowestDiff) {
                lowestDiff = difference;
            }
        }

        return lowestDiff;
    }
}