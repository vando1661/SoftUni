function orders(product,quantity){
    let sum = 0;
        switch (product){
            case 'coffee':
            sum = 1.50 * quantity;
            break;
            case 'water':
            sum = 1.00 * quantity;
            break;
            case 'coke':
            sum = 1.40 * quantity;
            break;
            case 'snacks':
            sum = 2.00 * quantity;
            break;
        }
        
    
    

    function decimalFormat(sum){
        return sum.toFixed(2);
    }
    
    console.log(decimalFormat(sum));
}

orders("water", 5);
orders("coffee", 2);