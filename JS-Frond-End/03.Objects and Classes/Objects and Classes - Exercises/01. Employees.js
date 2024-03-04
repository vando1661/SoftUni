function employees(input){
let person = {};
for (const key of input) {
    person[key] = key.length;
    
    
}
for (const key in person) {
     
    console.log(`Name: ${key} -- Personal Number: ${person[key]}`)
}

}
employees(
    ['Silas Butler',
    'Adnaan Buckley',
    'Juan Peterson',
    'Brendan Villarreal']
    );