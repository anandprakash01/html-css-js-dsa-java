
//callback function :---->   it will call the function after some amount of time
function addition(a,b,callback){
    var result = a+b;
    callback("addition",result);
}
function subtraction(a,b,details){
    var result = a-b;
    details("subtraction",result);
}
function display(type,input){
    console.log("final result for "+type+" and value is "+input);
}
addition(33,44,display);//calling from here
subtraction(44,12,display)

// foreach  --> it will iterate the value 
// some     --> it will return boolean value if anyone element matches the condition.
// every    --> all value should pass the condition then only it will return true otherwise false.
// find     --> search method to find value. if match is found it will return that particular value
//              otherwise undefined.function 

        //foreach
        var list=[44,55,22,45,332];
        list.forEach(function(input,idx){//second parameter is optional
            console.log(input,idx);
        })
        //some
        var familySeniorCitizen=[56,61,23,78,4,2];
        var result = familySeniorCitizen.some(function(input){
            return input>=60;
        });
        console.log(result);
        //every
        var voteListCitizen=[56,61,23,78,4,32];
        var result = voteListCitizen.every(function(input){
                return input>=18;
        });
        console.log(result);
        //find
        var list=["usa","uk","germany","india","japan"];
        var result = list.find(function(input){
               return input==="india";
        });
        console.log(result);