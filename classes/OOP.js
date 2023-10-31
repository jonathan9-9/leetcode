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
  sayPhrase = () => console.log(this.phrase); // Object Composition; we moved this method to the parent class to
  // pass down to any sub-class that may need it
}

// Cat is now the "child class"
class Cat extends Companion {
  #birthYear; // We declare the private property, always using the '#' symbol

  constructor(name, phrase, love, speed, birthYear) {
    super(name, phrase, love, speed);
    this.species = "cat";
    this.#birthYear = birthYear;
  }
  howOld = () => console.log(`I was born in ${this.#birthYear}`); // private method AKA Encapsulation
  nineLives = () => console.log("I have nine lives");
  // the affection method overrides its parent class affection method
  affection = () =>
    console.log(
      "I am doing a different thing, also known as inheritance-based polymorphism"
    );
}

class Hamster extends Companion {
  constructor(name, phrase, love, speed) {
    super(name, phrase, love, speed);
    this.species = "hamster";
  }
  silent = () => console.log("I am a silent animal");
}

class Dog extends Companion {
  // constructor function
  constructor(name, phrase, love, speed) {
    super(name, phrase, love, speed);
    this.species = "dog"; // property (characteristic)
  }

  bark = () => console.log("woof, woof!");
}

const dog1 = new Dog("Oreo", "I am Oreo the dog!", 7, 10);
const dog2 = new Dog("Pearl", "I love food!", 3, 25);
const cat1 = new Cat("Milo", "Meow!", 7, 7);
const hamster1 = new Hamster("Squishy", "Squeak!", 2, 5);

const canSayPhrase = (obj) => {
  obj.sayPhrase = () => console.log(`Now ${obj.name} can say a phrase`);
};
canSayPhrase(dog2);
dog2.sayPhrase(); // Output: "Now Pearl can say a phrase" AKA object composition; more flexibility in how we can change methods
// by defining the method in a higher class and creating separate function for any sub-classes that may need that method

dog2.sayPhrase(); // Output: I love food! // Parameter-based polymorphism

const catSayPhrase = (obj) => {
  obj.sayPhrase = () =>
    console.log(`${obj.name} can say something else besides Meow!`);
};
catSayPhrase(cat1);
cat1.sayPhrase(); // Output: "Milo can say something else besides Meow!"

cat1.console.log(dog1.name); // the Output will be: "Oreo"
cat1.nineLives(); // Output: I have nine lives

const cat3 = new Cat("Milo", "Meow", 8, 78);
cat3.affection(); // Output: My level of affection is 8
console.log(cat3.love); // Output: 8

const cat4 = new Cat("Milo", "Meow", 10, 70);
cat4.move(); // Output: I am moving at the speed of 70
console.log(cat4.speed); //Output: 70

// Encapsulation (public method accessed in another class)
const cat7 = new Cat("Feline", "I want food", 8, 55, 20);
console.log(cat7.name);
cat7.sayPhrase();

// Access the howOld method
cat7.howOld();
