function flightSchedule(input) {
  let firstArr = input[0];
  let secundArr = input[1];
  let thirdArr = input[2];
  let command = thirdArr[0];
  let flights = {};

  for (let element of firstArr) {
    let [flightNum, ...destination] = element.split(" ");
    destination = destination.join(" ");
    flights[flightNum] = { destination, status: null };
  }
  for (let element of secundArr) {
    let flightNum = element.split(" ")[0];
    let statusCurrent = element.split(" ")[1];
    if (flights.hasOwnProperty(flightNum)) {
      flights[flightNum].status = statusCurrent;
    }
  }
  for (let e in flights) {
    if (flights[e].status === null) {
      statusCurrent = "Ready to fly";
      flights[e].status = statusCurrent;
    }
  }
  let lightArr = [];
  for (const fly of Object.values(flights)) {
    lightArr.push(fly);
  }

  if (command === "Ready to fly") {
    for (const element of lightArr) {
      if (element.status === "Ready to fly") {
        console.log(
          `{ Destination: '${element.destination}', Status: '${element.status}' }`
        );
      }
    }
  } else if (command === "Cancelled") {
    for (const element of lightArr) {
      if (element.status === "Cancelled") {
        console.log(
          `{ Destination: '${element.destination}', Status: '${element.status}' }`
        );
      }
    }
  }
}

flightSchedule([
  [
    "WN269 Delaware",
    "FL2269 Oregon",
    "WN498 Las Vegas",
    "WN3145 Ohio",
    "WN612 Alabama",
    "WN4010 New York",
    "WN1173 California",
    "DL2120 Texas",
    "KL5744 Illinois",
    "WN678 Pennsylvania",
  ],
  [
    "DL2120 Cancelled",
    "WN612 Cancelled",
    "WN1173 Cancelled",
    "SK430 Cancelled",
  ],
  ["Cancelled"],
]);
