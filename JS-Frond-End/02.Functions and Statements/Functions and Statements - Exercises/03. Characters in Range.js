function charInRange(charOne, charTwo) {
  let charOneIndex = charOne.charCodeAt(0);
  let charTwoIndex = charTwo.charCodeAt(0);
  let minChar = Math.min(charOneIndex, charTwoIndex);
  let maxChar = Math.max(charOneIndex, charTwoIndex);
  let allChars = [];
  for (let charAscii = minChar + 1; charAscii < maxChar; charAscii++) {
    allChars.push(String.fromCharCode(charAscii));
  }
  return allChars.join(" ");
}
console.log(charInRange("a", "d"));
console.log(charInRange("#", ":"));
console.log(charInRange("C", "#"));
