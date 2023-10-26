class Dog {
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
  nineLives = () => console.log("I have nine 9 lives");
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
