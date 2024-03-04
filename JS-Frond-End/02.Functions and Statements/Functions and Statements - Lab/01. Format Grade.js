function formatGrade(grade){
if (grade < 3){
console.log(`Fail (2)`);
}
else if(grade >= 3 && grade < 3.5){
    console.log(`Poor (${decimalFormat(grade)})`);
}
else if(grade >= 3.5 && grade < 4.5){
    console.log(`Good (${decimalFormat(grade)})`);
}
else if(grade >= 4.5 && grade < 5.5){
    console.log(`Very good (${decimalFormat(grade)})`);
}
else if(grade >= 5.5){
    console.log(`Excellent (${decimalFormat(grade)})`);
}
function decimalFormat(grade){
    return grade.toFixed(2);
}
}
formatGrade(3.33);
formatGrade(4.50);
formatGrade(3);