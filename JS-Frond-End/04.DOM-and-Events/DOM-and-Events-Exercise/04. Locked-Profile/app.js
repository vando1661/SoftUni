function lockedProfile() {
  let buttons = Array.from(document.querySelectorAll("#main > div > button"));
  for (const btn of buttons) {
    btn.addEventListener("click", toggleInfo);
  }

  function toggleInfo(e) {
    let button = e.currentTarget;
    let currentProfile = button.parentElement;
    let currentInfo = Array.from(currentProfile.children);
    let infoDiv = currentInfo[9];
    let valueUnlock = currentInfo[4];
    let valueLock = currentInfo[2];
    if (valueUnlock.checked) {
      if (button.textContent === "Show more") {
        button.textContent = "Hide it";
        infoDiv.style.display = "block";
      } else if (button.textContent === "Hide it") {
        button.textContent = "Show more";
        infoDiv.style.display = "none";
      }
    }
  }
}
