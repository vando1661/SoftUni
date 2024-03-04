function vacation(peoples, types, days){
let totalPrice = 0;
switch(types){
    case 'Students':
        if(days === "Friday"){
            totalPrice = peoples * 8.45;
        }else if(days === "Saturday"){
            totalPrice = peoples * 9.80;
        }else if(days === "Sunday"){
            totalPrice = peoples * 10.46;
        }
        if(peoples >= 30){
            totalPrice = totalPrice * 0.85;
        }
        break;
    case 'Business':
        if (peoples >= 100){
           peoples -= 10;
        }
            if(days === "Friday"){
                totalPrice = peoples * 10.90;
            }else if(days === "Saturday"){
                totalPrice = peoples * 15.60;
            }else if(days === "Sunday"){
                totalPrice = peoples * 16;
            }
        
        
        break;
    case 'Regular':
        if(days === "Friday"){
            totalPrice = peoples * 15;
        }else if(days === "Saturday"){
            totalPrice = peoples * 20;
        }else if(days === "Sunday"){
            totalPrice = peoples * 22.50;         
        }
        if (peoples >= 10 && peoples <= 20){
            totalPrice = totalPrice * 0.95;
        }
        break;
}
console.log(`Total price: ${totalPrice.toFixed(2)}`)
}
vacation(100,"Business","Sunday");