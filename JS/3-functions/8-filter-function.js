var list = [
    {
        fullName: "rajesh",
        age: 34,
        address: "delhi",
        phone: 3431234
    }, {
        fullName: "suresh",
        age: 55,
        address: "noida",
        phone: 3431234
    }, {
        fullName: "ganesh",
        age: 12,
        address: "pune",
        phone: 2222
    }
];
var result = list.filter(function (input) {
    return input.age > 18;//it will return the objects which are satisfing the condition
});

console.log(result);