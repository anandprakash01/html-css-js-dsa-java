//create operation
var personType = {
    fullName: "akash",
    age: 22,
    salary: 34000
};

//read operation
console.log(personType);
console.log(personType.salary);
console.log(personType.address);

//update operation
personType.fullName = "suresh";
console.log(personType)

//add operation
personType.address = "delhi";
console.log(personType);

//delete operation:
delete personType.age;
console.log(personType)