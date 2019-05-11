/**
 * Problem link: https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 *
 *
 * Description: The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 */


function solution(N) {
  const binaryRepresentation = getBinaryRepresentation(N);
  let numOfBinaryGap = 0, binaryGapStarted = false, gapSize = 0, maxGap = 0;

  [...binaryRepresentation].forEach(char => {
    if  (char == 1 && !binaryGapStarted) {
      binaryGapStarted = true;
      gapSize = 0;
    } else if (char == 1 && binaryGapStarted) {
      if  (gapSize > maxGap) {
        maxGap = gapSize;
      }
      gapSize = 0;
      numOfBinaryGap++;
    } else if (char == 0 && binaryGapStarted) {
      gapSize++;
    }
  });

  return numOfBinaryGap > 0 ? maxGap : 0;
}

function getBinaryRepresentation(num){
  return num.toString(2);
}