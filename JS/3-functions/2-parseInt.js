
//parseInt
var input = "45";
console.log(typeof input, input);
input = parseInt(input);
console.log(typeof input, input);

//parseInt for float value
var input = "45.34234";
console.log(typeof input, input);
input = parseInt(input);
console.log(typeof input, input);

//parseInt for boolean and String value:
var input = true;
console.log(typeof input, input);
input = parseInt(input);
console.log(typeof input, input);//it will give NaN--> Not a Number

var input = "adf,";
console.log(typeof input, input);
input = parseInt(input);
console.log(typeof input, input);//it will give NaN--> Not a Number

var input = "ajdir45";
console.log(typeof input, input);
input = parseInt(input);
console.log(typeof input, input);//it will give NaN--> Not a Number

var input = "333ajdir";
console.log(typeof input, input);
input = parseInt(input);
console.log(typeof input, input);

var input = "462,45";
console.log(typeof input, input);
input = parseInt(input);
console.log(typeof input, input);

var input = "      45";
console.log(typeof input, input);
input = parseInt(input);
console.log(typeof input, input);

var input = "385 45";
console.log(typeof input, input);
input = parseInt(input);
console.log(typeof input, input);

var input = 333;
console.log(typeof input, input);
input = parseInt(input);
console.log(typeof input, input);


//parseFloat:
var input = "45.34234";
console.log(typeof input, input);
input = parseFloat(input);
console.log(typeof input, input);