function addressBook(input){
let notes = {};
for (const key of input) {
    let [name, street] = key.split(':');
    notes[name] = street;
}
let sortedNames = Object.keys(notes)
.sort((nameA, nameB) => nameA.localeCompare(nameB))
for (const key of sortedNames) {
   
    console.log(`${key} -> ${notes[key]}`)
}


}
addressBook(
['Tim:Doe Crossing',
'Bill:Nelson Place',
'Peter:Carlyle Ave',
'Bill:Ornery Rd']
);
addressBook(
['Bob:Huxley Rd',

'John:Milwaukee Crossing',

'Peter:Fordem Ave',

'Bob:Redwing Ave',

'George:Mesta Crossing',

'Ted:Gateway Way',

'Bill:Gateway Way',

'John:Grover Rd',

'Peter:Huxley Rd',

'Jeff:Gateway Way',

'Jeff:Huxley Rd'])