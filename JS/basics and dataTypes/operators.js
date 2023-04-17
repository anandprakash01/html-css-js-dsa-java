// Operand-- Entities on which operators operate

// Unary Operation-- It has single Operand
let num1=10;//assignment operator
let num2=20;
a= -a;
console.log(a);

// binary Operators-- It has two operand
console.log(num1-num2);

// 1. Arithmetic operatior
var a = 2;//assignment operator
var b = 4;
var result = (a*a) + (2*a*b) + (b*b);
console.log(result);

console.log(3**3); //exponantial operator
console.log(a++);
console.log(++a);


console.log(a>b);
console.log("cat" != "dog");
console.log("cat" == "dog");

var a = undefined;
var b = undefined;
console.log(a != b);
console.log(4 == 4);//true
console.log(4 == "4");//true

// tripple equalto operator
console.log(4 === "4");//false
console.log("cat" === "cat");

// &(and) Operator
console.log('hello' && 'world');
console.log(undefined && 0);
console.log(0 && 6);

// ||(or) Operator
var a = 'hello' || '';      // a = 'hello'
var b = '' || [];           // b = []
var c = '' || undefined;    // c = undefined
var d = 1 || 5;             // d = 1
var e = 0 || {};            // e = {}
var f = 0 || '' || 5;       // f = 5
var g = '' || 'yay' || 'boo';
console.log(b);
console.log(typeof b);

// !(not) Operator
console.log(!false);
console.log(!!false);// double not will give us the boolean value of operator

console.log(!undefined);//undefinde is false value so not will give true

console.log(2 * "details");