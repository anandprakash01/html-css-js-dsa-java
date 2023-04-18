
// A funtion passed inside another function is called as callback fun
setTimeout(() => {
    console.log("Timer Completed");
}, 5000);

// foreach  --> it will iterate the value 
// some     --> it will return boolean value if anyone element matches the condition.
// every    --> all value should pass the condition then only it will return true otherwise false.
// find     --> search method to find value. if match is found it will return that particular value
//              otherwise undefined function 

//foreach
var list = [44, 55, 22, 45, 332];
list.forEach(function (input, idx) {//second parameter is optional
    console.log(input, idx);
})
//some
var familySeniorCitizen = [56, 61, 23, 78, 4, 2];
var result = familySeniorCitizen.some(function (input) {
    return input >= 60;
});
console.log(result);
//every
var voteListCitizen = [56, 61, 23, 78, 4, 32];
var result = voteListCitizen.every(function (input) {
    return input >= 18;
});
console.log(result);
//find
var list = ["usa", "uk", "germany", "india", "japan"];
var result = list.find(function (input) {
    return input === "india";
});
console.log(result);