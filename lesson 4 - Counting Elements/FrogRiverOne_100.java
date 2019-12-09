// https://app.codility.com/demo/results/trainingN98VQ3-T9D/

class Solution {
    public int solution(int X, int[] A) {
        boolean[] track = new boolean[X];
        int sum = 0;
        int totalNumberOfLeaf = A.length;

        for (int index = 0; index<totalNumberOfLeaf; index++){
            if (!track[A[index]-1]) {
                track[A[index]-1] = true;
                sum++;
                if (sum == X){
                    return index;
                }
            }
        }
        return -1;
    }
}