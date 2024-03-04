function addAndSubtract(numOne,numTwo,numTree){
const sum = (a,b) => a + b;
const subtract = (mySum,num) => mySum - num;
return subtract(sum(numOne,numTwo),numTree);

// const calculations = (numOne,numTwo,numTree) => {
//     const sum = (a,b) => a + b;
// const subtract = (mySum,num) => mySum - num;
// return subtract(sum(numOne,numTwo),numTree);

// }
}
console.log(addAndSubtract(23,6,10));