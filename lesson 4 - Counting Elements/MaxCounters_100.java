
// https://app.codility.com/demo/results/trainingQGGWP4-FQA/
class Solution {
    public int[] solution(int N, int[] A) {
        int[] resultArray = new int[N];
        int maxCounter = 0;
        int minCounterForAll = maxCounter;

        for (int row = 0; row < A.length; row++) {
            if (N < A[row]) {
                minCounterForAll = maxCounter;
            } else {
                int count = resultArray[A[row] -1 ] > minCounterForAll ? resultArray[A[row] - 1] + 1 : minCounterForAll + 1;
                resultArray[A[row] -1] = count;

                if (maxCounter < count) maxCounter = count;
            }
        }

        for (int index = 0; index < N; index++){
            if (resultArray[index] < minCounterForAll)
                resultArray[index] = minCounterForAll;
        }

        return resultArray;
    }
}