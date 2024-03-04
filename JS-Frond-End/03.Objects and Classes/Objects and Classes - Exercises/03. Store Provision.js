function storeProvision(stock, orderProducts){
let stockArr = [...stock,...orderProducts];
let store = {};

for (let index = 0; index < stockArr.length; index++) {
    let prop = stockArr[index];
    if(index % 2 === 0){
        if(!store.hasOwnProperty(prop)){
            store[prop] = 0;
        }
    
    }
    else{
    prop = Number(prop)
    let previousProp = stockArr[index - 1];
    store[previousProp] += prop;
    }
    
}
for (const key in store) {
    console.log(`${key} -> ${store[key]}`)
}
}
storeProvision(
    [
    'Chips', '5', 'CocaCola', '9', 'Bananas',
    '14', 'Pasta', '4', 'Beer', '2'
    ],
    [
    'Flour', '44', 'Oil', '12', 'Pasta', '7',
    'Tomatoes', '70', 'Bananas', '30'
    ]);