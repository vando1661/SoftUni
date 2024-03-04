function meetings(input){
let notes = {};
for (const element of input) {
    let [day, name] = element.split(' ');
    
    if(notes.hasOwnProperty(day)){
        console.log(`Conflict on ${day}!`);
        
    }else{
        notes[day] = name;
        console.log(`Scheduled for ${day}`);
    }
   
}
for (const key in notes) {
    console.log(`${key} -> ${notes[key]}`);
}
}
meetings(
['Friday Bob',
'Saturday Ted',
'Monday Bill',
'Monday John',
'Wednesday George']
);