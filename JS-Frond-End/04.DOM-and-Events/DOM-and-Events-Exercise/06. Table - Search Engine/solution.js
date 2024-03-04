function solve() {
  let textSearch = document.getElementById("searchField");
  document.querySelector("#searchBtn").addEventListener("click", onClick);

  function onClick() {
    let searchValue = textSearch.value;
    let tableRows = Array.from(document.querySelectorAll("tbody  tr"));
    for (const row of tableRows) {
      let textTrim = row.textContent.trim();
      if (row.classList.contains("select")) {
        row.classList.remove("select");
      }
      if (textTrim.includes(searchValue)) {
        row.classList.add("select");
      }
    }
    textSearch.value = '';
  }
}
