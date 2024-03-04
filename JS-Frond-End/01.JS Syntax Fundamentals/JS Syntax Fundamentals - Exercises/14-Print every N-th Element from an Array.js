function printEveryNElement(arrString,num){
    let newArr = [];
    for (let index = 0; index < arrString.length; index+=num) {
        newArr.push(arrString[index]);
        
       

    }
    return newArr;
}
    console.log(printEveryNElement(['5','20','31','4','20'],2));

    console.log(printEveryNElement(['dsa', 'asd', 'test', 'tset'], 2));

    console.log(printEveryNElement(['1', '2', '3', '4', '5'],6));
 