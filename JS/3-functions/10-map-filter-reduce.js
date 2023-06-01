var list = [
    { fullName: "akash", age: 23, location: "delhi" },
    { fullName: "suresh", age: 17, location: "bangalore" },
    { fullName: "akash", age: 33, location: "chennai" },
    { fullName: "akash", age: 56, location: "kochi" }
];

//calculate sum of age which is age>18
var result = list.filter((input) => {
    return input.age > 18;
}).map((input) => {
    return input.age;
}).reduce((a, b) => {
    return a + b;
});

console.log(result);

const users = [
    { firstName: "Anand", lastName: "Prakash", age: 26 },
    { firstName: "Ana De", lastName: "Armas", age: 36 },
    { firstName: "Mughdha", lastName: "Agrawal", age: 28 },
    { firstName: "Praveen", lastName: "Bharti", age: 26 },
    { firstName: "Anurag", lastName: "Kewat", age: 10 }
]
// { 26: 2, 36: 1, 28: 1, 10: 1 } this should be output;
const sameAge = users.reduce((acc, curr) => {
    if (acc[curr.age]) {
        acc[curr.age] = ++acc[curr.age];
    }
    else {
        acc[curr.age] = 1;
    }
    return acc;
}, {});

console.log(sameAge);

// output should be firstName only who's age >= 18
//using filter and map
const adults = users.filter((user) => user.age >= 18)
    .map((user) => user.firstName);

//using reduce
const adults2 = users.reduce((acc, curr) => {
    if (curr.age >= 18) acc.push(curr.firstName);
    return acc;
}, []);

console.log(adults);
console.log(adults2);
