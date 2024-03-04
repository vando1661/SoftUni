function createElement(type, parentNode, content, classes, id, attributes, useInnerHtml){
    const htmlElement = document.createElement(type);

    if(content && useInnerHtml){
        htmlElement.innerHTML = content;
    }
    else{
        if(content &&  type !== 'input'){
          htmlElement.textContent = content;
        }
        if(content && type === 'input'){
            htmlElement.value = content;
        }
    }
    if(classes && classes.length > 0){
        htmlElement.classList.add(...classes);
    }
    if(id){
        htmlElement.id = id;
    }
    if(attributes){
        for (const key in arguments) {
            htmlElement[key] = attributes[key];
        }
    }
    if(parentNode){
        parentNode.appendChild(htmlElement);
    }
    return htmlElement;
}