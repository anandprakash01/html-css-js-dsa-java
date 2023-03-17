// name
// age

// work
// sleep

// /* -------------------------------------------------------------------------- */
// /*                                 Person One                                 */
// /* -------------------------------------------------------------------------- */
// const person = {};
// person.name = "Levi";
// person.age = 25;

// person.work = function () {
//   console.log(`${this.name} is working`);
// };

// person.sleep = function () {
//   console.log(`${this.name} is sleeping`);
// };

// /* -------------------------------------------------------------------------- */
// /*                                 Person Two                                 */
// /* -------------------------------------------------------------------------- */
// const personTwo = {};
// personTwo.name = "Mikasa";
// personTwo.age = 25;

// personTwo.work = function () {
//   console.log(`${this.name} is working`);
// };

// personTwo.sleep = function () {
//   console.log(`${this.name} is sleeping`);
// };

// Functional Instantiation

// function Person(name, age) {
//   const person = {};
//   person.name = name;
//   person.age = age;

//   person.work = function () {
//     console.log(`${this.name} is working`);
//   };

//   person.sleep = function () {
//     console.log(`${this.name} is sleeping`);
//   };

//   return person;
// }

// const personOne = Person("Levi", 28);

// const personTwo = Person("Mikasa", 25);

// Functional Instantion with shared methods

// const sharedMethods = {
//   work: function () {
//     console.log(`${this.name} is working`);
//   },
//   sleep: function () {
//     console.log(`${this.name} is sleeping`);
//   },
// };

// function Person(name, age) {
//   const person = {};
//   person.name = name;
//   person.age = age;

//   person.work = sharedMethods.work;

//   person.sleep = sharedMethods.sleep;

//   person.eat = sharedMethods.eat()

//   return person;
// }

// const personOne = Person("Levi", 28);
// const personTwo = Person("Mikasa", 30);
// const personThre = Person("Armin", 25);

// Object.create()

// Functional Instantion with Object.create

// const sharedMethodsForPersonObjects = {
//   work: function () {
//     console.log(`${this.name} is working`);
//   },
//   sleep: function () {
//     console.log(`${this.name} is sleeping`);
//   },
//   eat: function () {
//     console.log(`${this.name} is eating`);
//   },
// };

// function Person(name, age) {
//   const person = Object.create(sharedMethodsForPersonObjects);
//   person.name = name;
//   person.age = age;

//   return person;
// }

// const personOne = Person("Levi", 28);
// personOne.eat();

// Prototype

// // Constructor Function
// function Person(name, age) {
//   this.name = name;
//   this.age = age;
// }

// Person.prototype.work = function () {
//   console.log(`${this.name} is working`);
// };

// Array.prototype.map = function() {

// }

// Array.prototype.forEach = function() {

// }

// Person.prototype.sleep = function () {
//   console.log(`${this.name} is sleeping`);
// };

// Person.prototype.eat = function () {
//   console.log(`${this.name} is eating`);
// };

// const personOne = new Person("Levi", 28);

const array = [1, 2, 3];

Array.prototype.printAllElements = function () {
  for (const element of this) {
    console.log(element);
  }
};

array.printAllElements();

const anotherArray = ["A", "B", "C"];
anotherArray.printAllElements();