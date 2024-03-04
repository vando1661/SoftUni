function solve() {
  const [generateTextArea, buyTextArea] = Array.from(document.getElementsByTagName('textarea'));
  const [generateBtn, buyBtn] = Array.from(document.getElementsByTagName('button'));
  const tbody = document.querySelector('.table > tbody');

  generateBtn.addEventListener('click', generateHandler);
  buyBtn.addEventListener('click', buyHandler);

  function generateHandler() {
    const date = JSON.parse(generateTextArea.value);
    for (const { img, name, price, decFactor } of date) {
      const tableRow = createElement('tr', '', tbody);
      const firstColumnTd = createElement('td', '', tableRow);
      createElement('img', '', firstColumnTd, '', '', { src: img });
      const secundColumTd = createElement('td', '', tableRow);
      createElement('p', name, secundColumTd);
      const thirdColumTd = createElement('td', '', tableRow);
      createElement('p', price, thirdColumTd);
      const fourthColumTd = createElement('td', '', tableRow);
      createElement('p', decFactor, fourthColumTd);
      const fifthColumnTd = createElement('td', '', tableRow);
      createElement('input', '', fifthColumnTd, '', '', { type: 'checkbox'} );
      
    }
  }
  function buyHandler(){
    const allChecked = Array.from(document.querySelectorAll('tbody tr input:checked'));
    let boughtItems = [];
    let totalPrice = 0;
    let totalDecFactor = 0;
    for (const input of allChecked) {
      const tableRow = input.parentElement.parentElement;
      let [_firstCol, secundCol, thirdCol, fourthCol] = Array.from(tableRow.children);
      let item = secundCol.children[0].textContent;
      boughtItems.push(item);
      let currentPrice = Number(thirdCol.children[0].textContent);
      totalPrice += currentPrice;
      let currentDecFactor = Number(fourthCol.children[0].textContent);
      totalDecFactor += currentDecFactor;
    }
    buyTextArea.value += `Bought furniture: ${boughtItems.join(', ')}\n`;
    buyTextArea.value += `Total price: ${totalPrice.toFixed(2)}\n`;
    buyTextArea.value += `Average decoration factor: ${totalDecFactor / allChecked.length}`;
  }
  function createElement(type, content, parentNode, id, classes, attributes) {
    const htmlElement = document.createElement(type);
  
    if (content && type !== 'input') {
      htmlElement.textContent = content;
    }
    if (content && type === 'input') {
      htmlElement.value = content;
    }
    if (parentNode) {
      parentNode.appendChild(htmlElement);
    }
    if (id) {
      htmlElement.id = id;
    }
    if (classes) {
      htmlElement.classList.add(...classes);
    }
    if (attributes) {
      for (const key in attributes) {
        htmlElement.setAttribute(key, attributes[key]);
      }
    }
    return htmlElement;
  }
}


