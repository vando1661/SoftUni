function roadRadar(speed, area) {
    let speedCurrent = 0;
    let excessiveSpeed = 0;
    let status = '';
  switch (area) {
    case "residential":
        speedCurrent = 20;
      break;
    case "city":
        speedCurrent = 50;
      break;
    case "interstate":
        speedCurrent = 90;
      break;
    case "motorway":
        speedCurrent = 130;
      break;
  }
  if(speed <= speedCurrent){
    console.log(`Driving ${speed} km/h in a ${speedCurrent} zone`);
  }else{
    excessiveSpeed = speed - speedCurrent;
    if(excessiveSpeed <= 20){
        status = 'speeding';
    }else if(excessiveSpeed > 20 &&  excessiveSpeed <= 40){
        status = 'excessive speeding';
    }else {
        status = 'reckless driving';
    }
    console.log(`The speed is ${excessiveSpeed} km/h faster than the allowed speed of ${speedCurrent} - ${status}`);
  }
}
roadRadar(200, 'motorway');
