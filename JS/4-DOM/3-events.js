function submit() {
    var input = document.getElementById("clickEventTAG").value;
    alert(input);
}
// either do this
// document.getElementById("submit-btn").addEventListener("click", submit);

//after typing click outside
let inputBox = document.getElementById("changeEle");
inputBox.addEventListener('change', (event) => {//event is optional argument
    let disp = document.getElementById('box');
    disp.innerHTML = inputBox.value;
    disp.style.color = inputBox.value;
    disp.style.color = event.target.value; // use target for event
});
// .removeEventListener('mouseout', () => { });
/*
Browser events:
    -> click
    -> contexmenu   (mouse right click)
    -> mouseover/mouseout
    -> mousedown/mouseup
    -> mousemove

    -> submit / focus / change / select / reset
    -> keydown/keyup
    -> DOMContentLoaded
    -> transitionend


*/


