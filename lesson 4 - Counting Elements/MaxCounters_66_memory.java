
// https://app.codility.com/demo/results/training5Z4W4Y-VPX/
class Solution {
    public int[] solution(int N, int[] A) {
        int[] resultArray = new int[N];
        int[][] countersArray = new int[A.length][N];
        int maxCounter = 0;

        for (int row = 0; row < A.length; row++) {
            for (int column = 0; column < N; column++) {

                if (N < A[row]) {
                    countersArray[row][column] = maxCounter;
                } else if (column+1 == A[row]){
                    int count = row != 0? countersArray[row-1][column]+1 : 1;
                    countersArray[row][column] = count;

                    if (maxCounter < count) maxCounter = count;
                } else {
                    countersArray[row][column] = row != 0 ? countersArray[row-1][column] : 0;
                }

                if (row == A.length - 1){
                    resultArray[column] = countersArray[row][column];
                }
            }
        }

        return resultArray;
    }
}