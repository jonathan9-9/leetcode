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
