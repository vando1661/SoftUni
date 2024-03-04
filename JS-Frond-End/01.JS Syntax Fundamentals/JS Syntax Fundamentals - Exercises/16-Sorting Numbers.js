function sortingNumbers(numbers){
let arr = [...numbers].sort((aNum, bNum) => aNum - bNum);
let step = 0;
let newArr = [];
while(arr.length > 0){
    if(step % 2 === 0){
        let element = arr.shift();
    newArr.push(element);
    }
    else{
        let lasElement = arr.pop();
        newArr.push(lasElement);
    }
    step++;
}

return newArr;
}
console.log(sortingNumbers([1, 65, 3, 52, 48, 63, 31, -3, 18, 56]));