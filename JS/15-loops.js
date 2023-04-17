//for loop

var result = "";
for (var i = 2; i <= 40; i = i + 2) {
    result += " " + i;
}
console.log(result);

//for loop for array

var listNames = ["suresh", "mokesh", "arvind", "amol", "sathish", "apoorva"];
for (var i = 0; i < listNames.length; i++) {
    console.log(listNames[i]);
}
var listNames = [{ fullName: "sathish", age: 33 }, { fullName: "amol", age: 22 }];
for (var i = 0; i < listNames.length; i++) {
    console.log(listNames[i].fullName, listNames[i].age);
}

//for of
var list = [33, 45, 56, 33, 11, 22];
for (var obj of list) {
    console.log(obj);
}

//for in

var list = [33, 45, 56, 33, 11, 22];
for (var obj in list) {
    console.log(obj, list[obj]);
}

var list = {
    names: "akash",
    age: 33,
    address: "delhi",
    phone: 983434342123
}

for (var obj in list) {
    console.log(obj, list[obj]);
}