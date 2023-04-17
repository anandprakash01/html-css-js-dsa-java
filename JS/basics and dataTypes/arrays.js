//create operation
var list = ["samsung", 64, true, undefined, 34];

//read operation
console.log(list);
console.log(list[0]);
console.log(list[2]);
console.log(list[10]);//undifined

//update operation
list[3] = "akash";
console.log(list);

//delete operation:
list.pop(); //it will remove the element from last position.
console.log(list);

//add operation:
list.push(555);//it will add the element at the end position.
console.log(list);

// Array methods
console.log(list.length); //for array length

