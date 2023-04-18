
var person = {
    fullName: "suresh",
    amount: 45,
    flag: true,
    address: undefined,
};
console.log(typeof personAllTypes);
console.log(person);
console.log(person.fullName);
console.log(person.flag);
console.log(person.address);

//for key in double quotes it is valid object. But
//please dont use it. Double quotes is used for only json.
var personAllTypes = {
    "fullName": "suresh",
    "amount": 45,
    "flag": true,
    "address": undefined
};
console.log(typeof personAllTypes);

let employee = {
    name: "Anand",
    salary: "₹10",
    channel: "main channel",
    "channel 2": "2nd channel",
}
console.log(employee);
console.log(employee.name);
console.log(employee["channel 2"]);//we can not use key as direct for getting value

//Array of objects
var list = [
    { name: "samsung", specification: 'windowos', ram: 45 },
    { name: "sony", specification: 'windowos', ram: 45 },
    { name: "hp", specification: 'windowos', ram: 45 },
    { name: "mac", specification: 'macos', ram: 45 }
];

// console.log(list);
// console.log(list[0]);
// console.log(list[0].name);