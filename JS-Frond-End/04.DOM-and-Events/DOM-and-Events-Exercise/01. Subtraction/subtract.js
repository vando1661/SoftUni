function subtract() {
    let firstNum = Number(document.querySelector("#firstNumber").value);
    let secundNum = Number(document.querySelector("#secondNumber").value);
    let sum = firstNum - secundNum;
    let result = document.querySelector("#result");
    result.textContent = sum;
}