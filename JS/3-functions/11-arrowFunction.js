// Arrow function
// let greet =  ()=> {
//     console.log('Good morning');
// }

let greet = () => console.log('Good morning');
greet();
// let sum2 = (a, b)=>{
//     return a+b;
// };

let sum2 = (a, b) => a + b;

setTimeout(() => {
    console.log("We are inside setTimeout");
}, 3000);

let obj = {
    greeting: "Good Morning",
    names: ["Anand", "Yo Yo Honey Singh", "SkillF", "DjKhilad"],
    speak() {
        this.names.forEach((student) => {
            console.log(this.greeting + " Kukdoo Koo " + student);
        });
    }
    // if we use normal function here this.greeting (undefined) will not work
    // by default inside a function this keyword will be its own
    // but in arrow fun this will be from its parant
}
obj.speak();