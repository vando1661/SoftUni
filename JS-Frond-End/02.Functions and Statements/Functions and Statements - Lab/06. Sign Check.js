function signCheck(...numbers){
    return numbers
    .filter((num) => num < 0)
    .length % 2 === 0 ? `Positive` : `Negative`
//     let count = 0;
// for (let index = 0; index < numbers.length; index++) {
//     if(numbers[index]< 0){
//         count++;
//        }
// }
// if(count % 2 === 0){
//     console.log(`Positive`);
//    }else{
//     console.log(`Negative`);
//    }
}

console.log(signCheck( 5,12,-15));