var a = 2;
var b = 4;
var result = (a*a) + (2*a*b) + (b*b);
//4 + 16 + 16
//20 + 16
//36
console.log(result);

var a = 2;
var b = 4;
var result = a > b;
console.log(result);

var a = "cat";
var b = "dog";
var result = a != b;
console.log(result);

var a = true;
var b = true;
var result = a != b;
console.log(result);

var a = undefined;
var b = undefined;
var result = a != b;
console.log(result);

//assignment operator
var a = 4;
console.log(a);

//double equal to operator 
console.log("Double equal")
var result = 2 == 4;
console.log(result);
result = "cat" == "cat";
console.log(result);
result = false == false;
console.log(result);
result = 4 == "4";
console.log(result);

//tripple equalto
console.log("Tripple equal")
var result = 4 == " 4 ";
console.log(result);
result = 4 === "4";
console.log(result);
result = 4 === 4;
console.log(result);
result = "4" === "4";
console.log(result);

console.log("and operator");

var a = 'hello' && 'world';
console.log(a);
var b = '' && [] && {};
console.log(b);
var c = undefined && 0;
console.log(c);
var d = 0 && 6;
console.log(d);


console.log("or operator");

var a = 'hello' || '';      // a = 'hello'
var b = '' || [];           // b = []
var c = '' || undefined;    // c = undefined
var d = 1 || 5;             // d = 1
var e = 0 || {};            // e = {}
var f = 0 || '' || 5;       // f = 5
var g = '' || 'yay' || 'boo';

console.log("Not operator");
//0-false
//''-false 
//undefined - false
//false - false 
//null - false
//NaN - false
var result = true;
result = !result;
console.log(result);

var result = 0;
result = !result;
console.log(result);

result = '';
result = !result;
console.log(result);

result = undefined 
result = !result;
console.log(result);

result = false;
result = !result;
console.log(result);

result = null;
result = !result;
console.log(result);

result = 2 * "details";
console.log(result);
result = !result;
console.log(result);
