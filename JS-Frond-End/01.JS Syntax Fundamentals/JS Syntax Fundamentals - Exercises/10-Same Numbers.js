function sameNumbers(num){

let numbers  = num.toString().split('');
let digit = numbers[0];
let trueOrFalse = true;
let sum = 0;
for (let index = 0; index < numbers.length; index++) {
    if(numbers[index] !== digit){
        trueOrFalse = false;
    }
    sum += parseInt(numbers[index]);
}
console.log(trueOrFalse);
console.log(sum);
}
sameNumbers(2222222);
sameNumbers(1234);