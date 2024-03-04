function sumTable() {
  
  let trBody = document.querySelectorAll("body > table > tbody > tr > td:nth-child(2)");
  
  let total = 0;

 for (const e of trBody) {
    total += Number(e.textContent);
    console.log(total);
    
 }
let sum = document.querySelector("#sum");
  sum.textContent = total;
 
}
