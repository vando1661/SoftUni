function catalogue(input){
let catalogueObj = {};
for(line of input){
    let nameProduct = line.split(':')[0].trim();
    let priceProduct = Number(line.split(':')[1].trim());
    let firstChar = nameProduct[0]
    
    if(!catalogueObj.hasOwnProperty(firstChar)){
       catalogueObj[firstChar] = [];
       
    }
    catalogueObj[firstChar].push({nameProduct,priceProduct})
}
for (const key of Object.keys(catalogueObj).sort()) {
   console.log(key)
   for (const iterator of catalogueObj[key].sort((a,b) => a.nameProduct.localeCompare(b.nameProduct))) {
    console.log(` ${iterator.nameProduct}: ${iterator.priceProduct}`)
   }
}
}
catalogue([
    'Appricot : 20.4',
    'Appricot : 20.6',
    'Fridge : 1500',
    'TV : 1499',
    'Deodorant : 10',
    'Boiler : 300',
    'Apple : 1.25',
    'Anti-Bug Spray : 15',
    'T-Shirt : 10'
    ]
    );