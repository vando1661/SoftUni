function addItem() {
    let ulContainer = document.getElementById('items');
    let textArea = document.getElementById('newItemText');
    let newLi = document.createElement('li');
    newLi.textContent = textArea.value;
    ulContainer.appendChild(newLi);
    textArea.value = '';
}