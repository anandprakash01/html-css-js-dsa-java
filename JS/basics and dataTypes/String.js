var fullName = "anand"; // or 'anand'
var a = "Name: ";
console.log(fullName);
console.log(typeof fullName);
console.log(a + fullName);
var temp = `${fullName} is good "man"`;
console.log(temp);
console.log("hello\nWorld"); // for next line

let y = new String("yellow");
console.log(y);


// String methods
console.log(a.length);
let str = "anand is damm good";
console.log(str.indexOf("an"));//first occurance
console.log(str.lastIndexOf("an"));//last occurance

let substr = str.slice(1, 4);// total len is 3 from 1 index
console.log(substr);
substr = str.substring(1, 4);
console.log(substr);
substr = str.substr(1, 4);//in this the last arg is the length
console.log(substr);

let newstr = str.replace("anand", "prakash");//it will replace anand to prakash
console.log(newstr)

console.log(newstr.toUpperCase());// to upper case
console.log(newstr.toLowerCase());

console.log(newstr.concat(" Anand"));
console.log("          anand         prakash".trim());//removes spaces from start and end

let char = str.charAt(1);//return character
console.log(char);

console.log(str.charCodeAt(1)); // character code
console.log(str[1]);

