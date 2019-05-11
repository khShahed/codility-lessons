/**
 * Problem Link: https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 *
 *
 * This solution scored 66%. Time complexity was O(N**2). Got timeout error for 3 test case.
 */


function solution(A) {
  let unpairedValues = [];
  console.log(A);
  A.forEach(value => {
    if (unpairedValues.includes(value)) {
      unpairedValues = unpairedValues.filter(uv => uv !== value);
    } else {
      unpairedValues.push(value);
    }
  });

  return unpairedValues[0];
}

console.log(solution([1,2,3,3,2]));