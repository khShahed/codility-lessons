// https://app.codility.com/demo/results/trainingVVV5VV-4KF/

import java.util.*;

class Solution {
    public int solution(int[] A) {
        int smallestNumber = 1;
        Set<Integer> numbers = new HashSet<>();
        for (int index = 0; index < A.length; index++) {
            if (smallestNumber == A[index]){
                while (true) {
                    smallestNumber++;
                    if (numbers.contains(smallestNumber)) {
                        numbers.remove(smallestNumber);
                    } else {
                        break;
                    }
                }
            } else if (A[index] > 1){
                numbers.add(A[index]);
            }
        }

        return smallestNumber;
    }
}