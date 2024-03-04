function horseRacing(input) {
  let horses = input.shift().split("|");
  for (const line of input) {
    if (line === 'Finish') {
      console.log(horses.join("->"));
      let winnerHorseIndex = horses.length - 1;
      let winner = horses[winnerHorseIndex];
      console.log(`The winner is: ${winner}`);
      return;
    }
    let command = line.split(' ')[0];
    if (command === 'Retake') {
      let takingHorse = line.split(' ')[1];
      let takenHorse = line.split(' ')[2];
      let indexTakingHorse = horses.indexOf(takingHorse);
      let indexTakenHorse = horses.indexOf(takenHorse);
      if (indexTakingHorse < indexTakenHorse) {
        horses.splice(indexTakingHorse, 1, takenHorse);
        horses.splice(indexTakenHorse, 1, takingHorse);
        console.log(`${takingHorse} retakes ${takenHorse}.`);
      }
    } else if (command === 'Trouble') {
      let nameHorseTrouble = line.split(' ')[1];
      let indexHorseTrouble = horses.indexOf(nameHorseTrouble);

      if (indexHorseTrouble > 0) {
        let backHorseIndex = indexHorseTrouble - 1;
        let backHorse = horses[backHorseIndex];
        horses.splice(indexHorseTrouble, 1, backHorse);
        horses.splice(backHorseIndex, 1, nameHorseTrouble);
        console.log(`Trouble for ${nameHorseTrouble} - drops one position.`);
      }
    } else if (command === 'Rage') {
      let nameHorse = line.split(' ')[1];
      let nameHorseIndex = horses.indexOf(nameHorse);
      let indexFirsPosition = horses.length - 1;
      
      let indexSecundPosition = horses.length - 2;
      if (nameHorseIndex < indexFirsPosition) {
        if (nameHorseIndex === indexSecundPosition) {
          horses.splice(nameHorseIndex, 1);
          horses.push(nameHorse);
        } else {
          horses.splice(nameHorseIndex, 1);
          horses.splice(nameHorseIndex + 2, 0, nameHorse);
        }
      }
      console.log(`${nameHorse} rages 2 positions ahead.`);
    } else if (command === 'Miracle') {
      let idexFirstPosition = horses.length - 1;
      let nameLastHorse = horses[0];
      horses.splice(0, 1);
      horses.splice(idexFirstPosition, 0, nameLastHorse);
      console.log(`What a miracle - ${nameLastHorse} becomes first.`);
    }
  }
}
horseRacing((['Bella|Alexia|Sugar',
'Retake Alexia Sugar',
'Rage Bella',
'Trouble Bella',
'Finish'])

);
