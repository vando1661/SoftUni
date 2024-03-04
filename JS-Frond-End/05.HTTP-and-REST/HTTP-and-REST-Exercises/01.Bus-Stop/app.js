function getInfo() {
  const searchStopId = document.getElementById("stopId");
  const stopNameContainer = document.getElementById("stopName");
  const busesContainer = document.getElementById("buses");
  const BASE_URL = "http://localhost:3030/jsonstore/bus/businfo/";
  const stopId = searchStopId.value;

  busesContainer.innerHTML = '';
  fetch(`${BASE_URL}${stopId}`)
    .then((res) => res.json())
    .then((bussInfo) => {
      const { buses, name } = bussInfo;
      stopNameContainer.textContent = name;
      for (const busId in buses) {
        const li = document.createElement("li");
        li.textContent = `Bus ${busId} arrives in ${buses[busId]} minutes`;
        busesContainer.appendChild(li);
      }
      console.log(bussInfo);
    })
    .catch(() => {
      stopNameContainer.textContent = 'Error';
    });
}
