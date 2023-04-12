
    function addition(a,b){
        return a+b;
    }
    console.log(addition(44,55));

    //arrow function is a new syntax
    //we need to declare in variable
    //always use const variable because function should be unique throughout the page.
    //()=>{}
    const subtraction=(a,b)=>{
       return a-b;
    }
    console.log(subtraction(10,5));

    //if you have only one parameter () is optional
    //if you have only one statement return keyword is optional
    const display=name=>name;
    console.log(display("rajesh"));


    var list = [
        {
            fullName: "rajesh",
            age: 34
        }, {
            fullName: "suresh",
            age: 55
        }
    ];
    var result = list.map((input)=>{
           return input;
    });
    console.log(result);