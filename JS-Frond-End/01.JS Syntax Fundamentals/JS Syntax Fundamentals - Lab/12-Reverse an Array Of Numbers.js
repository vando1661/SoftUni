function reverseArrayOfNum (n, inputArr){
let newArr = [];
for (let index = 0; index < n; index++) {
    newArr.push(inputArr[index]);
    
}
newArr.reverse();
console.log(newArr.join(' '));
}

reverseArrayOfNum(3, [10, 20, 30, 40, 50]);