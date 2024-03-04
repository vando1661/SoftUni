function leapYear(years){
let answer = "";
if ( years % 400 === 0 || years % 4 === 0 && years % 100 !== 0){
    answer = "yes";
}
else{
    answer = "no";
}
console.log(answer);
}
leapYear(400);