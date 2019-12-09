
// https://app.codility.com/demo/results/trainingXQF6VJ-ED4/
class Solution {
    public int[] solution(int N, int[] A) {
        int[] resultArray = new int[N];
        int maxCounter = 0;

        for (int row = 0; row < A.length; row++) {
            if (N < A[row]) {
                for (int column = 0; column < N; column++) {
                    resultArray[column] = maxCounter;
                }
            } else {
                int count = resultArray[A[row] -1 ] + 1;
                resultArray[A[row] -1] = count;

                if (maxCounter < count) maxCounter = count;
            }
        }

        return resultArray;
    }
}