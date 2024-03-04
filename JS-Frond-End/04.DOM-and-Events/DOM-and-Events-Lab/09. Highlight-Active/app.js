function focused() {
let inputSection = Array.from(document.querySelectorAll("input[type=text]"));
    for (const d of inputSection) {
        d.addEventListener('focus',focused);
        d.addEventListener('blur', blur);
    }
    function focused(e){
        e.currentTarget.parentElement.classList.add('focused');
    }
    function blur(e){
        e.currentTarget.parentElement.classList.remove('focused');
    }
  
}