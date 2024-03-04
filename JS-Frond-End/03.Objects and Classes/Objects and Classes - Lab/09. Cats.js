function catsList(input){
    let cats = [];
    class Cat{
    constructor(name, age){
        this.name = name;
        this.age = age;
    }
    speak(){
        console.log(`${this.name}, age ${this.age} says Meow`)
    }
    }
    for (let index = 0; index < input.length; index++) {
        let = catInfo = input[index].split(` `);
        cats.push(new Cat(catInfo[0], catInfo[1]));
        
    }
    for (const cat of cats) {
        cat.speak();
    }


}
catsList(['Mellow 2', 'Tom 5']);