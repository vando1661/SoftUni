function arrayRotation(numbers,rotations){
rotations %= numbers.length; 
for (let index = 0; index < rotations; index++) {
   let firstNum = numbers.shift();
   numbers.push(firstNum);
    
}

console.log(numbers.join(' '));
}
arrayRotation([51, 47, 32, 61, 21], 2);