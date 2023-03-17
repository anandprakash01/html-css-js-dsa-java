    //map function is array method
    //it will return new array
    //it will help to manipulate or do changes in your code.
    var list = [
        {
            fullName: "rajesh",
            age: 34,
            address:"delhi",
            phone:3431234
        }, {
            fullName: "suresh",
            age: 55,
            address:"noida",
            phone:3431234
        }, {
            fullName: "ganesh",
            age: 12,
            address:"pune",
            phone:2222
        }
    ];
    var result = list.map(function(input){
           return input;
    });
    console.log(result);

    var result = list.map(function(input){
           return input.fullName;//will return only this property
    });
    console.log(result);

    var result = list.map(function(input){
           return {name:input.fullName,criteria:input.age};
    });
    console.log(result);