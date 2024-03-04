function oddOccurrences(input) {
  let wordsObj = {};
  let text = input.split(" ");
  for (const element of text) {
    let word = element.toLowerCase();
    if (!wordsObj.hasOwnProperty(word)) {
      wordsObj[word] = 0;
    }
    wordsObj[word]++;
  }
  let sortArr = Object.entries(wordsObj).sort((a,b) => b[1] - a[1]);
  let arr = [];
  for (const [word, count]  of sortArr) {
    

    if (count % 2 !== 0) {
      arr.push(word);
    }
  }
  
  console.log(arr.join(' '));
}
oddOccurrences("Java C# Php PHP Java PhP 3 C# 3 1 5 C#");
oddOccurrences('Cake IS SWEET is Soft CAKE sweet Food');
