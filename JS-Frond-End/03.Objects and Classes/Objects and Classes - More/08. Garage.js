function garage(input) {
  let arrInput = [...input];
  let listGarage = {};
  for (const carLine of arrInput) {
    let numGarage = carLine.split(" - ")[0];
    let infoCar = carLine.split(" - ")[1];
    if (!listGarage.hasOwnProperty(numGarage)) {
      listGarage[numGarage] = [];
    }
    listGarage[numGarage].push(infoCar);
  }
  for (let elementLine in listGarage) {
    console.log(`Garage № ${elementLine}`);
    for (let car of listGarage[elementLine]) {
      yaCars = car.replace(":", " -");
      newCar = yaCars.replace(":", " -");
      newCars = newCar.replace(":", " -");

      console.log(`--- ${newCars.replace(":", " -")}`);
    }
  }
}
garage([
  "1 - color: blue, fuel type: diesel",
  "1 - color: red, manufacture: Audi",
  "2 - fuel type: petrol",
  "4 - color: dark blue, fuel type: diesel, manufacture: Fiat",
]);
