function countString(text,word){
let words = text.split(' ');
let count = 0;
for(let w of words){
    if(w === word){
        count++
    }
}console.log(count);
}
countString('This is a word and it also is a sentence','is');