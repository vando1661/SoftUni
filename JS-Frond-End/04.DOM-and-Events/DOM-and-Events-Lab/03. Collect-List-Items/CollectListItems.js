function extractText() {
   let liElements = Array.from(document.querySelectorAll('#items > li'));
   let textArea = document.getElementById('result');
   liElements
   .forEach((li) => {
    textArea.textContent += li.textContent + '\n';

   })

}