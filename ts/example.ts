const sumAll = (arrayIntegers: number[]) => {
  arrayIntegers.reduce((acc, currValue) => {
    return acc + currValue;
  }, 0);
};

let numbers = [5, 2, 9, 19];
console.log(sumAll(numbers));
