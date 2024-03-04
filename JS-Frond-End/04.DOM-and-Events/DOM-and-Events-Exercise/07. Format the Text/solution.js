function solve() {
  const output = document.getElementById("output");
  const textArea = document.getElementById("input");
  let textList = textArea.value.split(".");
  textList.pop();
  while (textList.length > 0) {
    let paragraph = textList.splice(0, 3).map((p) => p.trimStart());
    let newParagraph = document.createElement("p");
    newParagraph.textContent = paragraph.join(".") + ".";
    output.appendChild(newParagraph);
  }
}