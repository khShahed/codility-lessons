/**
 * Problem Link: https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 *
 *
 * This solution scored 100%. Time complexity was O(N) or O(N*log(N)).
 */


function solution(A) {
  let unpairedValues = {};
  A.forEach(value => {
    if (unpairedValues.hasOwnProperty(value.toString())) {
      delete unpairedValues[value.toString()];
    } else {
      unpairedValues[value.toString()] = true;
    }
  });
  return parseInt(Object.keys(unpairedValues)[0]);
}
console.time("array-initialization");
let array = [];
for (let i = 0; i < 100002; i++ ) {
  let number = Math.floor(Math.random() * Math.floor(1200));
  array.unshift(number);
  array.push(number);
}
array.push(1201);
console.timeEnd("array-initialization");

console.time("array");
// console.log(solution([1,2,3,3,2]));
console.log(solution(array));
console.timeEnd("array");