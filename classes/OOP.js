class Dog {
  // constructor function
  constructor(name, phrase) {
    this.name = name; // properties (characteristics)
    this.phrase = phrase;
    this.species = "dog";
  }

  bark = () => console.log("woof, woof!");
  sayPhrase = () => console.log(this.phrase); // method (action)
}

class Cat {
  constructor(name, phrase) {
    this.name = name;
    this.phrase = phrase;
    this.species = "cat";
  }
  nineLives = () => console.log("I have nine lives");
  sayPhrase = () => console.log(this.phrase);
}

class Hamster {
  constructor(name, phrase) {
    this.name = name;
    this.phrase = phrase;
    this.species = "hamster";
  }
  silent = () => console.log("I am a silent animal");
  sayPhrase = () => console.log(this.phrase);
}

const dog1 = new Dog("Oreo", "I am Oreo the dog!");
const dog2 = new Dog("Pearl", "I love food!");
const cat1 = new Cat("Milo", "Meow!");
const hamster1 = new Hamster("Squishy", "Squeak!");

console.log(dog1.name); // the output will be: "Oreo"
cat1.nineLives(); // output: I have nine lives

class Animal {
  constructor(speed) {
    this.speed = speed;
  }
  move = () => console.log(`I am moving at the speed of ${this.speed}`);
}

// parent class
class Companion extends Animal {
  constructor(love, speed) {
    super(speed);
    this.love = love;
  }
  affection = () => console.log(`My level of affection is ${this.love}`);
}

class Cat extends Companion {
  constructor(name, phrase, love, speed) {
    super(love, speed);
    this.name = name;
    this.phrase = phrase;
    this.species = "cat";
  }
  nineLives = () => console.log("I have nine lives");
  sayPhrase = () => console.log(this.phrase);
}

const cat3 = new Cat("Milo", "Meow", 8);
cat3.affection(); // Output: My level of affection is 8
console.log(cat3.love); // Output: 8
