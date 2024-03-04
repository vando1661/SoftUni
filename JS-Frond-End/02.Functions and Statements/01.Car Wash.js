function carWash(textInput){
    let carCleaning = 0;
for (const w of textInput) {
    if(w === 'soap'){
    carCleaning += 10;
    }
    else if(w === 'water'){
    carCleaning *= 1.20;
    }
    else if(w === 'vacuum cleaner'){
    carCleaning *= 1.25;
    }
    else if(w === 'mud'){
    carCleaning *= 0.9;
    }
}
console.log(`The car is ${carCleaning.toFixed(2)}% clean.`)
}
carWash(['soap', 'soap', 'vacuum cleaner', 'mud', 'soap', 'water']);
carWash(["soap", "water", "mud", "mud", "water", "mud", "vacuum cleaner"]);