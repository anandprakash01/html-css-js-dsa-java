
//simple for loop for array
var listNames = ["suresh", "mokesh", "arvind", "amol", "sathish", "apoorva"];
for (var i = 0; i < listNames.length; i++) {
    // console.log(listNames[i]);
}

//for of
var list = [33, 45, 56, 33, 11, 22];
for (let obj of list) {
    // console.log(obj);
}

//for in
for (var idx in list) {
    console.log(idx, list[idx]);
}

//forEach
list.forEach(element => {
    console.log(element);
})

//object
var list = {
    names: "akash",
    age: 33,
    address: "delhi",
    phone: 983434342123999
}
for (var key in list) {
    // console.log(key, list[key]);
}


//while loop
var i = 1;
while (i < 5) {
    // console.log(i);
    i++;
}

//do while loop
var j = 5;
do {
    // console.log(j);
    j++;
} while (j < 4);
