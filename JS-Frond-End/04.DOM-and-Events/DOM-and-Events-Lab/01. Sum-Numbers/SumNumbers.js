function calc() {
  let firstNumInput = document.getElementById("num1");
  let secundNumInput = document.getElementById("num2");
  let sumInput = document.getElementById("sum");

  let numberOne = Number(firstNumInput.value);
  let numberTwo = Number(secundNumInput.value);
  let sum = numberOne + numberTwo;
  sumInput.value = sum;
}
