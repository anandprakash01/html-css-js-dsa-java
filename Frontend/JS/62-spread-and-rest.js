
// Spread Operator (ES6 - ES2015)

// Use Case 1. Copying Arrays

const first = ["A", "B"];
const second = ["D", "E"];
//it will spread the array 
const copyArray = [...second, "F", "G", 1, ...second];
console.log("Copied Array", copyArray);

var one = [4, 5];
var two = [5, 6];
var list = [one, two];
console.log(list);

// spread in new copied Array;
var list = [55, 33];
var listTwo = list;//this will not create new array this will passed by reference
console.log("list", list);
console.log("listTwo", listTwo);
listTwo.push(22);//this will affect in both ;
console.log("list", list);
console.log("listTwo", listTwo);


var list = [55, 33];
var listTwo = [...list];
//spread will create new array
console.log("list", list);
console.log("listTwo", listTwo);
listTwo.push(22);
console.log("list", list);
console.log("listTwo", listTwo);


// Use Case 2. Copying Objects
var list = {
    fullName: "akash",
    age: 12
};
var listTwo = list;
console.log(list);
console.log(listTwo);
listTwo.job = true;//this will be added in both
console.log(list);
console.log(listTwo);


var list = {
    fullName: "akash",
    age: 12
};
var listTwo = { ...list };
console.log(list);
console.log(listTwo);
listTwo.job = true;
console.log(list);
console.log(listTwo);

//with variables
var a = 56;
var b = a;
console.log(a);
console.log(b);
b = 88;//this will not affect a because passed by value
console.log(a);
console.log(b);

var inputString = "akash";
var inputStringTwo = inputString;
console.log(inputString);
console.log(inputStringTwo);
inputStringTwo = "suresh";//this will not affect inputString because passed by value
console.log(inputString);
console.log(inputStringTwo);

var inputBoolean = true;
var inputBooleanTwo = inputBoolean;
console.log(inputBoolean);
console.log(inputBooleanTwo);
inputBooleanTwo = false;//this will not affect inputString because passed by value
console.log(inputBoolean);
console.log(inputBooleanTwo);


const parent = {
    id: 1,
    city: "Hyderabad",
    score: 100,
};

const child = {
    id: 6,
    ...parent,
};

console.log(child);

//Use Case 3 : Spreading within the function call

const arr = [10, 19, 5, 199, 200];
const answer = Math.max(...arr);

console.log(answer);

function sum(a, b) {
    return a + b;
}

const array = [1, 2, 3, 4];

const result = sum(...array);

//Rest Operator

function sum(a, b, ...rest) {
    // a -> 1
    // b -> 2
    // rest -> [ 3, 4 ]

    const nums = [a, b, ...rest];
    // [1, 2, 3, 4]
    let sum = 0;
    for (const num of nums) {
        sum += num;
    }
    return sum;
}

const result3 = sum(1, 2, 3, 4);
console.log(result3);


/*---------------Destructuring---------------*/

//object destructuring

const object = {
  state: "Telangana",
  country: "India",
  president: 560,
};

//other ways
// let city = object.city;
// if (!city) {
//   city = "Hyderabad";
// }
// const city = object.city ? object.city : "Hyderabad";
//const city = object.city || "Hyderabad";

const { city = "Hyderabad" } = object;
console.log(city);

//Array Destructuring

const student = ["Aditya", 0, "Dancing"];
// userName
// score
// hobby

// const {} = object; -> Object Destructuring

const [userName, score, hobby] = student;
console.log(userName, score, hobby);

// const userName = student[0];
// const score = student[1];
// const hobby = student[2];

const emojis = ["🔥", "😈", "🚀"];
// fire
// devil
// rocket

// OLD WAY! :(
// const fire = emojis[0];
// const devil = emojis[1];
// const rocket = emojis[2];

// NEW WAY!! :D
const [fire, , rocket] = emojis;
console.log(fire, rocket);