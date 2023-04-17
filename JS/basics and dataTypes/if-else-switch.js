let age = 45;
if (age > 40) {
    console.log("age is greater then 40");
} else {
    console.log("no match found")
}

// switch
let days = "wednesday";
switch (days) {
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