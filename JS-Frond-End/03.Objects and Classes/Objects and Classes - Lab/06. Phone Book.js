function phoneBook(input){
let phoneNotes = {};
for (const kye of input) {
        let [name, phoneNumber ] = kye.split(' ');
         phoneNotes[name] = phoneNumber;
    }
    for (const key in phoneNotes) {
        console.log(`${key} -> ${phoneNotes[key]}`)
    }
}
phoneBook(
['Tim 0834212554',
'Peter 0877547887',
'Bill 0896543112',
'Tim 0876566344']
);