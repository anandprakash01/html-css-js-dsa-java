//ternary operator

var netflixSubscription = true;
    var result = netflixSubscription === true ?"yes we have subscription":"please reacharge now";
    console.log(result);

    //implecit conversion
var string = ""
var number = 40
var boolean = true

var result = 40 + true;
console.log(result);
//number + boolean --> number

result = false + ""
console.log(result);
//boolean + string --->string

result = 40 + ""
console.log(result);
//number + string --->string

var result = true + "hello";
console.log(typeof result);

var a = true * "hello";
console.log(typeof b);
var b = 3 * "hello";
console.log(typeof b);
console.log(b);

//Explicit or type casting
console.log("----Explicit----");
var a="anand";
a = Number(a);
console.log(a);
console.log(typeof a);

var a=69;
a = String(a);
console.log(a);
console.log(typeof a);

var a=false;
a = Number(a);
console.log(a);
console.log(typeof a);

var a="";
a = Boolean(a);
console.log(a);
console.log(typeof a);





