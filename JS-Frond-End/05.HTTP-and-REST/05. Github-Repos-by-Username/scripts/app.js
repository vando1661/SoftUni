function loadRepos() {
	const BASE_URL = 'https://api.github.com/users/';
	const username = document.getElementById('username');
	const usernameVal = username.value;
	const reposList = document.getElementById('repos')
	fetch(`${BASE_URL}${usernameVal}/repos`)
    .then((res) => res.json())
    .then((data) => {
		reposList.innerHTML = '';
        data.forEach(element => {
			
            const listItem = createElement('li', '', reposList);
			const anchor = createElement('a', element.full_name, listItem, '', '', { href: element.html_url});
        })
    })
    .catch((err) => {
        repos.innerHTML = '';
		const listItem = createElement('li', err.message, reposList);
    })
	function createElement(type, content, parentNode, id, classes, attributes){
		const htmlElement = document.createElement(type);
	
		if (content && type === 'input') {
		  htmlElement.value = content;
		}
		if (content && type !== 'input') {
		  htmlElement.textContent = content;
		}
	
		if (id) {
		  htmlElement.id = id;
		}
		if (classes) {
		  htmlElement.classList.add(...classes)
		}
		if (attributes) {
		  for (const key in attributes) {
			htmlElement.setAttribute(key, attributes[key])
		  }
		}
		if (parentNode) {
		  parentNode.appendChild(htmlElement);
		}
		return htmlElement;
	  }
}