function evenAndOdd(arrNum) {
  let evenSum = 0;
  let oddSum = 0;
  for (let i = 0; i < arrNum.length; i++) {
    let num = arrNum[i];
    if (num % 2 == 0) {
      evenSum += num;
    } else {
      oddSum += num;
    }
  }
console.log(evenSum - oddSum);
}
evenAndOdd([2,4,6,8,10])
