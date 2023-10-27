// Grandparent class
class Animal {
  constructor(speed) {
    this.speed = speed;
  }
  move = () => console.log(`I am moving at the speed of ${this.speed}`);
}

// parent class
class Companion extends Animal {
  constructor(name, phrase, love, speed) {
    super(name, phrase, love, speed);
    this.name = name;
    this.phrase = phrase;
    this.love = love;
  }
  affection = () => console.log(`My level of affection is ${this.love}`);
}

// Cat is now the "child class"
class Cat extends Companion {
  constructor(name, phrase, love, speed) {
    super(name, phrase, love, speed);
    this.species = "cat";
  }
  nineLives = () => console.log("I have nine lives");
  sayPhrase = () => console.log(this.phrase);
}

class Hamster extends Companion {
  constructor(name, phrase, love, speed) {
    super(name, phrase, love, speed);
    this.species = "hamster";
  }
  silent = () => console.log("I am a silent animal");
  sayPhrase = () => console.log(this.phrase);
}

class Dog extends Companion {
  // constructor function
  constructor(name, phrase, love, speed) {
    super(name, phrase, love, speed);
    this.species = "dog"; // property (characteristic)
  }

  bark = () => console.log("woof, woof!");
  sayPhrase = () => console.log(this.phrase); // method (action)
}

const dog1 = new Dog("Oreo", "I am Oreo the dog!");
const dog2 = new Dog("Pearl", "I love food!");
const cat1 = new Cat("Milo", "Meow!");
const hamster1 = new Hamster("Squishy", "Squeak!");

console.log(dog1.name); // the output will be: "Oreo"
cat1.nineLives(); // output: I have nine lives

const cat3 = new Cat("Milo", "Meow", 8);
cat3.affection(); // Output: My level of affection is 8
console.log(cat3.love); // Output: 8

const cat4 = new Cat("Milo", "Meow", 10, 70);
cat4.move(); // output: I am moving at the speed of 70
console.log(cat4.speed); //output: 70
