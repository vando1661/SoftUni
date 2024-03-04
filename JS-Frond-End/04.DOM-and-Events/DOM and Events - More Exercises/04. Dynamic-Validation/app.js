function validate() {
    let input = document.getElementById('email');

    input.addEventListener('change', validate);

    function validate() {
        let emailRegex = /^[a-z]+@[a-z]+[\.][a-z]{2,3}$/;
        let match = input.value.match(emailRegex)
        if (!match) {
            input.classList.add('error');
        }
        else {
            input.classList.remove('error');
            input.value = '';
        }
    }
}