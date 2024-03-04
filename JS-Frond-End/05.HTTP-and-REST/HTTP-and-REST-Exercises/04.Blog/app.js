function attachEvents() {
    const BASE_URL_POSTS = 'http://localhost:3030/jsonstore/blog/posts';
    const BASE_URL_COMMENTS = 'http://localhost:3030/jsonstore/blog/comments';
    const btnLoadPosts = document.getElementById('btnLoadPosts');
    const btnViewPosts = document.getElementById("btnViewPost");
    const selectPosts = document.getElementById("posts");
    const postTitleH1 = document.getElementById("post-title");
    const postBodyP = document.getElementById("post-body");
    const postCommentsUl = document.getElementById("post-comments");
    let postObj = {};
    
    btnLoadPosts.addEventListener("click", loadHandler);
    btnViewPosts.addEventListener('click', viewHandler);
    function loadHandler() {
      fetch(BASE_URL_POSTS)
        .then((res) => res.json())
        .then((postData) => {
            postObj = postData;
            for (const key in postData) {
            const optionPost = document.createElement('option');
            optionPost.value = key;
            optionPost.textContent = postData[key].title;
            selectPosts.appendChild(optionPost);

            }
        })
        .catch(() => {
          console.log("Error");
        });
    }
    function viewHandler(){
        fetch(BASE_URL_COMMENTS)
        .then((res) => res.json())
        .then((comments) => {
            postCommentsUl.innerHTML = '';
            for (const key in comments) {
                
                postTitleH1.textContent = postObj[selectPosts.value].title;
                postBodyP.textContent = postObj[selectPosts.value].body;
                if(comments[key].postId  === selectPosts.value){
                let liComments = document.createElement('li');
                
                liComments.textContent = comments[key].text;
                postCommentsUl.appendChild(liComments);

                }
                
            }
        })
        .catch(() => {
            console.log('Error');
        })   
    }
}

attachEvents();