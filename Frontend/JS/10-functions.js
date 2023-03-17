function display() {
    console.log("hello world");
    console.log("javascript");
}
display();
display();

//passing single parameter
function dis(name) {
    console.log("I am",name);
}
dis("anand");
dis();
dis("hr",26);

//multiple parameter
function dis(name,age) {
    console.log("My name is",name,age);
}
dis("anand",23);
dis("anand");//is is taking the last fun

//passing array
function displayArray(list) {
    console.log(list);
}
displayArray([2, 3, 6, 2]);

//passing object
function displayObj(obj) {
    console.log(obj);
}
displayObj({ name: "anand", age: 23 });

//return keyword
function addition(a,b){
    return a+b;
}
function display(type){
 console.log("The total value is",type);
}
var result = addition(3,4);
display(result);