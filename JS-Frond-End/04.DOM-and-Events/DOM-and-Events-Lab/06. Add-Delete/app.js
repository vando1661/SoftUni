function addItem() {
    let newAnchor = document.createElement('a');
    let ulContainer = document.getElementById('items');
    let textArea = document.getElementById('newItemText');
    let newLi = document.createElement('li');
    newLi.textContent = textArea.value;
    newAnchor.textContent = '[Delete]';
    newAnchor.setAttribute('href', '#');
    newAnchor.addEventListener('click',deleteHandler);
    newLi.appendChild(newAnchor);
    ulContainer.appendChild(newLi);
    textArea.value = '';
    
  function deleteHandler(e){
  let liItem = e.currentTarget.parentElement;
  liItem.remove();
  }  
}