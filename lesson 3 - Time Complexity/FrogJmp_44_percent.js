/**
 * Problem Link: https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 *
 *
 * This solution scored 44%. Time complexity was O(Y-X). Got timeout error for 5 test case.
 */

/**
 * @param X - Current Location
 * @param Y - Frog wants to go to position greater or equal to Y
 * @param D - Jump distance
 * @returns Minimal number of jumps required to go to position Y
 */
function solution(X, Y, D){
  let jumpsCount = 0;

  if (X === Y) return jumpsCount;

  while (X < Y) {
    X += D;
    jumpsCount++;
  }

  return jumpsCount;
}

console.log(solution(10, 85, 30));