// https://app.codility.com/demo/results/trainingKP6C65-5N9/

class Solution {
    public int solution(int[] A) {
        int numberOfPairs = 0;
        int firstCarDirection = A[0];
        int numberOfCarGoingTheSameDirectionAsFirstCarIncludingFirstCar = 1;
        for (int index = 1; index < A.length; index++) {
            if (A[index] == firstCarDirection)
                numberOfCarGoingTheSameDirectionAsFirstCarIncludingFirstCar++;
            else
                numberOfPairs += numberOfCarGoingTheSameDirectionAsFirstCarIncludingFirstCar;

            if (numberOfPairs > 1_000_000_000)
                return -1;
        }

        return numberOfPairs;
    }
}