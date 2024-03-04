function modernTimesOfHashtag(text){
const  pater = (/^[A-Za-z]+$/);
let words = [];
for (let word of text.split(' ')) {
    if(word.startsWith('#') && word.length > 1){
    word = word.substring(1);
    if(pater.test(word)){
    words.push(word);
    }
    }
}
console.log(words.join('\n'));
}
modernTimesOfHashtag('Nowadays everyone uses # to tag a #special word in #socialMedia');
modernTimesOfHashtag('The symbol # is known #variously in English-speaking #regions as the #number sign');