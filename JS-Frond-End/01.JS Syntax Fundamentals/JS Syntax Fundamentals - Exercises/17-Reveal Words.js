function revealWords(words,text){
for (const word of words.split(', ')){
    for (const item of text.split(' ')) {
        if((item === '*'.repeat(item.length)) && word.length === item.length){
            text = text.replace(item, word);
        }
    }
}
console.log(text);
}
revealWords('great, learning','softuni is ***** place for ******** new programming languages');