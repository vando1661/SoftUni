function loadingBar(num){
if(num !== 100){
let loadingSymbol = [];
let countersSymbol = num / 10;
for (let index = 1; index <= countersSymbol; index++) {
    loadingSymbol.push('%');
}
for (let i = 1; i <= 10 - countersSymbol; i++) {
    loadingSymbol.push('.');
    
}
console.log(`${num}% [${loadingSymbol.join('')}]`);
console.log('Still loading...');  
}
else{
    console.log('100% Complete!');
}
}

loadingBar(30);
loadingBar(50);
loadingBar(100);