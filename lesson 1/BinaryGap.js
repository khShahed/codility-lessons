/**
 * Problem link: https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 *
 *
 * This solution scored 100%.
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