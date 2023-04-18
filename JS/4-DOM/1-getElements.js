// getElementById
let main = document.getElementById("main");
// console.log(main);


// getElementsByClassName
let container = document.getElementsByClassName("container");//this returns array of elements
// console.log(container);

for (element of container) {
    // element.classList.add("dynamic-class");
}
container[1].innerHTML = "Second Container";

// getElementsbtTagName
let liTag = document.getElementsByTagName("li");
for (tag of liTag) {
    // console.log(tag);
}

// querySelector ===> we can use all css selectors
let select = document.querySelector("#check");
// let select = document.querySelectorAll("#check");//can not use all in "id"

let result = document.querySelectorAll(".container");
// result.innerHTML = "<h1>Hey!! querySelector</h1";//can not do this coz it returns an array

//accessing only with tag + class
let tagAndClass = document.querySelector("div.container");// it select only first one
// tagAndClass = document.querySelectorAll("div.container");//it selects all classes with match
console.log(tagAndClass);
