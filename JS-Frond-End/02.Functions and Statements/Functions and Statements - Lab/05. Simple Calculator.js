function simpleCalculator(numOne,numTwo, operator){
const add = (a,b) => a + b;
const subtract = (a,b) => a - b;
const divide = (a,b) => a / b;
const multiply = (a,b) => a * b;
const operationMap = {
add: add,
subtract: subtract,
divide: divide,
multiply:multiply,
}

    return operationMap[operator] (numOne,numTwo)
}
console.log(simpleCalculator(5,5,'multiply'));