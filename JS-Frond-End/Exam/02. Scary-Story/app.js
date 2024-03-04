window.addEventListener("load", solve);

function solve() {
  function createElement(
    type,
    parentNode,
    content,
    classes,
    id,
    attributes,
    useInnerHtml
  ) {
    const htmlElement = document.createElement(type);

    if (content && useInnerHtml) {
      htmlElement.innerHTML = content;
    } else {
      if (content && type !== "input") {
        htmlElement.textContent = content;
      }
      if (content && type === "input") {
        htmlElement.value = content;
      }
    }
    if (classes && classes.length > 0) {
      htmlElement.classList.add(...classes);
    }
    if (id) {
      htmlElement.id = id;
    }
    if (attributes) {
      for (const key in arguments) {
        htmlElement[key] = attributes[key];
      }
    }
    if (parentNode) {
      parentNode.appendChild(htmlElement);
    }
    return htmlElement;
  }
  const storyState = {
    firstName: null,
    lastName: null,
    age: null,
    title: null,
    genre: null,
    story: null,
  };
  const inputDOMSelectors = {
    firstName: document.getElementById("first-name"),
    lastName: document.getElementById("last-name"),
    age: document.getElementById("age"),
    title: document.getElementById("story-title"),
    genre: document.getElementById("genre"),
    story: document.getElementById("story"),
  };
  const otherDOMSelectors = {
    publishBtn: document.getElementById("form-btn"),
    previewTextArea: document.getElementById("preview-list"),
    mainContainer: document.getElementById("main"),
    publishedList: document.getElementById('published-list'),
  };
  otherDOMSelectors.publishBtn.addEventListener("click", publishStoryHandler);

  // let p = createElement('p',otherDOMSelectors.previewTextArea,'My-paragraph',['story'],'my-id','ul')

  function publishStoryHandler() {
    const allFieldsHaveValue = Object.values(inputDOMSelectors).every(
      (input) => input.value !== ""
    );
    if (!allFieldsHaveValue) {
      console.log("EMPTY FIELD");
      return;
    } else {
      let liInfo = createElement(
        "li",
        otherDOMSelectors.previewTextArea,
        null,
        ["story-info"]
      );
      let article = createElement("article", liInfo);
      let h4name = createElement(
        "h4",
        article,
        "Name: " +
          inputDOMSelectors.firstName.value +
          " " +
          inputDOMSelectors.lastName.value
      );
      let pAge = createElement(
        "p",
        article,
        "Age: " + inputDOMSelectors.age.value
      );
      let pTitle = createElement(
        "p",
        article,
        "Title: " + inputDOMSelectors.title.value
      );
      let pGenre = createElement(
        "p",
        article,
        "Genre: " + inputDOMSelectors.genre.value
      );
      let pStory = createElement("p", article, inputDOMSelectors.story.value);
      let btnSave = createElement("button", liInfo, "Save Story", ["save-btn"]);
      let btnEdit = createElement("button", liInfo, "Edit Story", ["edit-btn"]);
      let btnDelete = createElement("button", liInfo, "Delete Story", [
        "delete-btn",
      ]);
      for (const key in inputDOMSelectors) {
        storyState[key] = inputDOMSelectors[key].value;
      }
      Object.values(inputDOMSelectors).forEach((input) => {
        input.value = "";
      });
      otherDOMSelectors.publishBtn.setAttribute("disabled", true);
      btnEdit.addEventListener("click", editStoryHandler);
      btnDelete.addEventListener("click", deleteStoryHandler);
      btnSave.addEventListener("click", saveStoryHandler);
    }
  }
  function editStoryHandler(event) {
    for (const key in inputDOMSelectors) {
      inputDOMSelectors[key].value = storyState[key];
    }
    otherDOMSelectors.publishBtn.removeAttribute("disabled");
    let li = event.currentTarget.parentNode;
    li.remove();
    // let li = document.querySelector('.story-info')
    // otherDOMSelectors.previewTextArea.removeChild('li')
  }
  function deleteStoryHandler(event) {
    otherDOMSelectors.publishBtn.removeAttribute("disabled");
    let li = event.currentTarget.parentNode;
    li.remove();
  }
  function saveStoryHandler() {
    otherDOMSelectors.mainContainer.remove();
    const bodyStory = document.querySelector("body");
    let divMain = createElement("div", bodyStory, null, null, "main");
    createElement("h1", divMain, "Your scary story is saved!");
  }
}
