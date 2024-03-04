function wordTracker(input) {
  let searchWords = input.shift().split(" ");
  let words = {};

  for (const word of searchWords) {
    let count = input.filter((w) => w === word).length;

    words[word] = count;
  }
  let sortedWord = Object.entries(words).sort((wordA, wordB) => {
    let [_nameA, countA] = wordA;
    let [_nameB, countB] = wordB;
    return countB - countA;
  });
  for (const word of sortedWord) {
    console.log(word.join(" - "));
  }
}
// wordTracker([
//     'this sentence',
//     'In', 'this', 'sentence', 'you', 'have',
//     'to', 'count', 'the', 'occurrences', 'of',
//     'the', 'words', 'this', 'and', 'sentence',
//     'because', 'this', 'is', 'your', 'task'
//     ]);
wordTracker([
  "is the",
  "first",
  "sentence",
  "Here",
  "is",
  "another",
  "the",
  "And",
  "finally",
  "the",
  "the",
  "sentence",
]);
