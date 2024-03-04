function fruits(fruit,grams,price){
let kgFruit = grams / 1000;
let needMoney = kgFruit * price;
console.log(`I need $${needMoney.toFixed(2)} to buy ${kgFruit.toFixed(2)} kilograms ${fruit}.`)
}
fruits('orange', 2500, 1.80);