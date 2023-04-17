
var person={
    fullName:"suresh",
    amount:45,
    flag:true,
    address:undefined
};
console.log(typeof personAllTypes);
console.log(person);
console.log(person.fullName);
console.log(person.flag);
console.log(person.address);

//for key in double quotes it is valid object. But
//please dont use it. Double quotes is used for only json.
var personAllTypes={
    "fullName":"suresh",
    "amount":45,
    "flag":true,
    "address":undefined
};
console.log(typeof personAllTypes);