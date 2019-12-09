/**
 * Problem Link: https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 *
 *
 * This solution scored 100%. Time complexity was O(1).
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
  let difference = Y - X;
  jumpsCount =  Math.ceil(difference / D);

  return jumpsCount;
}

console.log(solution(10, 85, 30));