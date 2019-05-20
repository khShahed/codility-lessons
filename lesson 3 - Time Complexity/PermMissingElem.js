/**
 * Problem Link: https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 *
 *
 * This solution scored 100%. Time complexity was O(N) or O(N * log(N)).
 */

/**
 *
 * @param A -  Array containing integers in the range [1..(N + 1)]
 * @returns the missing element in array
 */
function solution(A){
  let missingElement;

  let numberOfElements = A.length + 1;
  let totalSummation = (numberOfElements * (numberOfElements + 1)) / 2; // n(n+1) / 2

  let arraySummation = A.reduce((partialSum, a) => partialSum + a, 0);
  missingElement = totalSummation - arraySummation;

  return missingElement;
}

console.log(solution([2, 3, 1, 5]));