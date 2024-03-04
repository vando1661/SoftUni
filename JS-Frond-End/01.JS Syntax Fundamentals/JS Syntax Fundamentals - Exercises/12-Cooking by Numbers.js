function cookingByNum(numbers, ...operations) {
    let num = Number(numbers);
    operations.
    forEach((operations) => {
        switch (operations) {
            case "chop":
                num /= 2;
              break;
            case "dice":
                num = Math.sqrt(num);
              break;
            case "spice":
                num ++;
              break;
            case "bake":
                num *= 3;
              break;
            case "fillet":
                num -= num * 0.20;
        
              break;
          }
          console.log(num);
    });
  
}
cookingByNum('9', 'dice', 'spice', 'chop', 'bake','fillet');
