function solve() {
  
  const infoScreen = Array.from(document.getElementsByClassName('info'))[0];
  const departId = document.getElementById('depart');
  const arriveId = document.getElementById('arrive');
  const BASE_URL = "http://localhost:3030/jsonstore/bus/schedule/";
  let nextStopId = 'depot';
  let stopName = null;
  function depart() {
    departId.disabled = true;
    arriveId.disabled = false;
    fetch(`${BASE_URL}${nextStopId}`)
    .then((res) => res.json())
    .then((nextStopInfo) => {
        const{ name, next } = nextStopInfo;
        infoScreen.textContent = `Next stop ${name}`;
        nextStopId = next;
        stopName = name;
        console.log(name);
    })
    .catch(() => {
        infoScreen.textContent = 'Error';
        departId.disabled = true;
        arriveId.disabled = true;
    })
  }

  async function arrive() {
    departId.disabled = false;
    arriveId.disabled = true;
    infoScreen.textContent = `Arriving at ${stopName}`;
    
  }
  
  return {
    depart,
    arrive,
  };
}

let result = solve();
