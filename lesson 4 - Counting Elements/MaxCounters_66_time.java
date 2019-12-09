
// https://app.codility.com/demo/results/trainingEXM7FE-RZZ/
class Solution {
    public int[] solution(int N, int[] A) {
        int[] resultArray = new int[N];
        int maxCounter = 0;

        for (int row = 0; row < A.length; row++) {
            for (int column = 0; column < N; column++) {

                if (N < A[row]) {
                    resultArray[column] = maxCounter;
                } else if (column+1 == A[row]){
                    int count = resultArray[column] + 1;
                    resultArray[column] = count;

                    if (maxCounter < count) maxCounter = count;
                }
            }
        }

        return resultArray;
    }
}