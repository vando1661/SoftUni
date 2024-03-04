function solve(typeOfDay,age){
    let result;
if (age >= 0 && age <= 18){
    if(typeOfDay === `Weekday`){
        result = 12;
    }
    else if(typeOfDay === `Weekend`){
        result = 15;
    }else{
        result = 5;
    }
    console.log(`${result}$`)
}else if (age > 18 && age <= 64){
    if(typeOfDay === `Weekday`){
        result = 18;
    }
    else if(typeOfDay === `Weekend`){
        result = 20;
    }else{
        result = 12;
    }
    console.log(`${result}$`)
}else if (age > 64 && age <= 122){
    if(typeOfDay === `Weekday`){
        result = 12;
    }
    else if(typeOfDay === `Weekend`){
        result = 15;
    }else{
        result = 10;
    }
    console.log(`${result}$`)
}else {
    console.log(`Error!`);
    
}

}
