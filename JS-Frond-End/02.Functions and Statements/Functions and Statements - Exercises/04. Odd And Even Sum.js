function oddAndEven(numbers){
let num = [...numbers.toString()];
let oddSum = 0;
let evenSum = 0;
num.map(n => n % 2 === 0 ? evenSum += parseInt(n) : oddSum += parseInt(n))
// for (const n of num) {
//     if(n % 2 === 0){
//         evenSum += parseInt(n);
//     }
//     else{
//         oddSum += parseInt(n);
//     }
// }
console.log(`Odd sum = ${oddSum}, Even sum = ${evenSum}`)

}
oddAndEven(1000435);
oddAndEven(3495892137259234);
