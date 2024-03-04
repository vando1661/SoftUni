function toggle() {
  let btn = document.querySelector("#accordion > div.head > span");
  let divA = document.getElementById("extra");
  if (btn.textContent === "More") {
    btn.textContent = "Less";
    divA.style.display = "block";
  }
  else if (btn.textContent === 'Less'){
    btn.textContent = "More";
    divA.style.display = 'none';
  }
  console.log(divA);
}
