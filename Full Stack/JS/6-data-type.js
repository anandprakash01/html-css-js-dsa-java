
// String
var fullName = "anand";
console.log(typeof fullName);

// Number
var age = 34;
var amount = 34.22;
var add = -56;
console.log(typeof age);
console.log(add);

// Boolean
    var statusDetails = true;
    var flag = false;
    console.log(typeof flag);

// undefined
var address;
console.log(typeof address);

// Dynamic Datatypes:
var fullName = "anand";
fullName = "prakash";
console.log(typeof fullName);
fullName = 45;
console.log(typeof fullName);

//object type:
var personObject = {
    fullName:"akash",
    age:45
};
console.log(personObject);
console.log(personObject.fullName);
console.log(personObject.age);

var personAllTypes={
    fullName:"suresh",
    amount:45,
    flag:true,
    address:undefined
};
console.log(typeof personAllTypes);
//for key in double quotes it is valid object. But
//please dont use it. Double quotes is used for only json.
var personAllTypes={
    "fullName":"suresh",
    "amount":45,
    "flag":true,
    "address":undefined
};
console.log(typeof personAllTypes);

//constant:
//once you declare the variable there only we need to pass value.you cannot redclare the value.
//old javascript we don't this features.it came on latest es6 features of javascript.
//for constant please use capital letter variable.
//initializer is mandatory while declaring the constant.
// const PI;
const PI=3.14;
// PI = 56;
console.log(PI);
