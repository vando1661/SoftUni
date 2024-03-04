function passwordValidator(password){
let output = '';
let isValid = true;
if(!(password.length >= 6 && password.length <= 10)){
output = `Password must be between 6 and 10 characters\n`;
isValid = false;
}
let regexLettersAndDigits = password.split('').filter(x => (/^[a-zA-z0-9]+/).test(x));
if(regexLettersAndDigits.length !== password.length){
output += 'Password must consist only of letters and digits\n';
isValid = false;
}
let regexMinTwoDigits = password.split('').filter(x => (/^\d$/).test(x));
if(regexMinTwoDigits.length < 2){
    output += 'Password must have at least 2 digits\n';
    isValid = false;
}
if(isValid === true){
   output = 'Password is valid'; 
}
console.log(output);

}
// passwordValidator('logIn');
passwordValidator('MyPass123');
// passwordValidator('Pa$s$s');