
var age = 45;
var age = 55;
if(age>40){
    console.log("age is greater then 40");
}

var age = 45;
var age = 55;
if(age>40){
    console.log("age is greater then 40");
}else{
    console.log("no match found")
}

var age = 1;
var citizenship = "india";
if((age>20 && age<30) && citizenship === "usa"){
    console.log("eligibility to vote in usa");
}else if((age>18 && citizenship === "india")){
    console.log("eligible to vote in india")
}else if((age>40 && citizenship === "japan")){
    console.log(("eligible to vote in japan"))
}else{
    console.log("no match");
}
// switch

var days = "wednesday";
console.log("line 2");
switch(days){
    case "monday":
            console.log("it is matching monday");
            break;
    case "tuesday":
           console.log("it is tuesday");
           break;
    case "wednesday":
    case "WEDNESDAY":
           console.log("it is wednesday");
           break;
    default:
        console.log("no match found");
    
}