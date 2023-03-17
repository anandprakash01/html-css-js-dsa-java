var list=[
    {
        fullName:"akash",
        age:23,
        location:"delhi"
    },
    {
        fullName:"suresh",
        age:17,
        location:"bangalore"
    },
    {
        fullName:"akash",
        age:33,
        location:"chennai"
    },
    {
        fullName:"akash",
        age:56,
        location:"kochi"
    }
];
// var result=list.filter(function(input){
//     return input.age>18;
// }).map(function(input){
//     return input.age;
// }).reduce(function(a,b){
//     return a+b;
// });

//Arrow function syntax
var result=list.filter((input)=>{
    return input.age>18;
}).map((input)=>{
    return input.age;
}).reduce((a,b)=>{
    return a+b;
});

console.log(result);

//job status should be true and I need total amount 
var list=[{
    expenseName:"bike",
    amount:12000,
    job:true
},
{
    expenseName:"car",
    amount:12000,
    job:false
},{
    expenseName:"ac",
    amount:12000,
    job:true
}];
var result = list.filter((input)=>{
       return input.job === true;
}).reduce((a,b)=>{
     return a.amount + b.amount
});
console.log(result);