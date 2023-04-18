//Image
let img = document.getElementById("img");
img.src = "./angelina.jpg";
img.style.width = "100px";

// ById
let check = document.getElementById("check");
check.innerHTML = "Hello! Anand Prakash";
check.textContent = "Hello! Anand Prakash(textContent)";
check.style.color = 'red';
check.style.fontSize = "45px";
check.style.border = "1px solid blue";
check.style.margin = "5px";

//ByClassName
let container = document.getElementsByClassName("container");//this returns array of elements
for (element of container) {
    element.classList.add("dynamic-class");
}
container[1].innerHTML = "Second Container";

//querySelector
let select = document.querySelector("#check");
select.innerHTML += " Additionl innerHTML";

select.setAttribute("class", "box");
select.setAttribute("dataTest", "carry details");

// Create element and append
var element = document.createElement('p');
//hello world
var textElement = document.createTextNode("hello world!! CreateElement and Appending");
//<p>hello world</p>
element.appendChild(textElement);
//<div id="demo"></div>
var input = document.getElementById('main');
//<div id="demo"><p>hello world</p></div>
input.appendChild(element);
