/**
 * Problem Link: https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 *
 *
 * This solution scored 100%.
 */

function solution(A, K) {
    for (let i=0; i < K; i++) {
        A = rotateArray(A);
    }
    return A;
}

function rotateArray(array) {
    if (array.length === 1) return array;
    array.unshift(array.pop());
    return array;
}

let testArray = [3, 8, 9, 7, 6];
// [9, 7, 6, 3, 8]


console.log(solution(testArray, 3));