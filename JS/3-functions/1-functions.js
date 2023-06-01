
//--------funtion Statement or function declaration-----
function a() {
    console.log("a is called");
}
//named function
function fiboseries(number) {
    if (number <= 1) return 1;
    return fiboseries(number - 1) + fiboseries(number - 2);
}

// ----------------function expression------------------
let b = function () {
    console.log("b is called");
}
// Named function expression
let d = function xyz() {
    console.log("xyz is called");
    console.log(xyz);// we can access xyz here
}
// xyz();// error 
d();

// ----------------Anonymous function-------------------
// A function without name is called anonymous function.
// when functions are used as value we use anonymous fun
const addition = (a, b) => {
    return a + b;
}
var subtraction = function (a, b) {
    return a + b;
}

a();
b();
addition(2, 3);
//anonymous function
//IIFE - immediately invoke function
(function () {
    console.log("onload");
})();


// difference b/w Prameter and Arguments?
// Parameter:- Function defination
// Arguments:- Function call

// -------------First Class function-----------
/* The ability of function to be used as funtion and can be passed as arguments
and can be returned from a funtion this is called as Firstclass funtion */

//first class citizens
let e = function (fun) {
    console.log("e is called");
    console.log(fun);
}
function s() { }
e(s);

//--------------Arrow function----------

let f = () => {
    console.log('Arrow function')
}