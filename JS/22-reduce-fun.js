var list=[45,33,11,23,44];
    var result = list.reduce(function(a,b){
        return a+b;
    });
    //45+33 = 78
    //78+11=89
    //89+23=112
    //112+44=156
    console.log(result);

    var list=[45,66,22,34,52];
    //reduce function will have two parameters
    var count = 1;
    var result = list.reduce((inputOne,inputTwo)=>{
         console.log(count,inputOne,inputTwo);
         count++;
         return inputOne+inputTwo;
    });
    console.log(result);