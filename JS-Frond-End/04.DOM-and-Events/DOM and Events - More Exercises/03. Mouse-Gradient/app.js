function attachGradientEvents() {
    let button = document.getElementById('gradient');
     
    let result = document.getElementById('result');
    
    button.addEventListener('mousemove', calculate);
    button.addEventListener('mouseout', out);


    function calculate(e) {
        let calc = Math.floor(Number(e.offsetX / button.clientWidth * 100));
        
        result.textContent = `${calc}%`;
    }

    function out() {
        result.textContent = '';
    }
}