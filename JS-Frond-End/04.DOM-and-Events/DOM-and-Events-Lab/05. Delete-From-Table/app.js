function deleteByEmail() {
    let result = document.getElementById('result');
    let input = document.querySelector('input[name="email"]');
    let emailValue = input.value;
    let tableBody = Array.from(document.querySelectorAll("td:nth-child(even)"));
    let foundElement = tableBody.find((td) => td.textContent === emailValue);
    if(foundElement){
        foundElement.parentElement.remove();
        
        result.textContent = 'Delete.';
    }else{
        result.textContent = 'Not found.';
    }
    
    

}   