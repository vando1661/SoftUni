window.addEventListener("load", solve);

function solve() {
    const taskState = {
        taskTitle: null,
        taskCategory: null,
        taskContent: null,
    };
    const inputSelectors = {
        taskTitle: document.getElementById('task-title'),
        taskCategory: document.getElementById('task-category'),
        taskContent: document.getElementById('task-content'),
        
    }
    const otherSelectors = {
        btnPublish: document.getElementById('publish-btn'),
        relatedPosts: document.getElementById('relatedPosts'),
        barTitle: document.querySelector("#relatedPosts > div"),
        reviewList: document.getElementById('review-list'),
        publishedList: document.getElementById('published-list'),
    }
    otherSelectors.btnPublish.addEventListener("click",publishTaskHandler);
    function publishTaskHandler(event){
        const allFieldsValue = Object.values(inputSelectors).every(
            (input) => input.value !== ""
          );
          if (!allFieldsValue) {
            console.log("EMPTY FIELD");
            return;
          }else{
            let liInfo = createElement('li',otherSelectors.reviewList,null,["rpost"]);
            let article = createElement('article',liInfo);
            let h4name = createElement('h4',article,inputSelectors.taskTitle.value);
            let pCategory = createElement('p',article,inputSelectors.taskCategory.value);
            let pContent = createElement('p',article,inputSelectors.taskContent.value);
            let btnEdit = createElement('button',liInfo,'Edit',["action-btn"]);
            let btnPost = createElement('button',liInfo,'Post',["action-btn"]);
            for (const key in inputSelectors) {
                taskState[key] = inputSelectors[key].value;
              }
              Object.values(inputSelectors).forEach((input) => {
                input.value = "";
              });
              btnEdit.addEventListener("click", editHandler);
              btnPost.addEventListener("click",postHandler);
          }
    }
    function editHandler(event){
        for (const key in inputSelectors) {
            inputSelectors[key].value = taskState[key];
          }
          let li = event.currentTarget.parentNode;
          li.remove();
          
          
    }
    function postHandler(event){
        for (const key in otherSelectors) {
            otherSelectors[key].value = taskState[key];
            
          }
          console.log(taskState);
          let li = event.currentTarget.parentNode;
          li.remove();
            let liInfo = createElement('li',otherSelectors.publishedList,null,["rpost"]);
            let article = createElement('article',liInfo);
            let h4name = createElement('h4',article,taskState.taskTitle);
            let pCategory = createElement('p',article,taskState.taskCategory);
            let pContent = createElement('p',article,taskState.taskContent);
    }
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
}