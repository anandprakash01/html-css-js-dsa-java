// Named export

// export function sum(a,b){
//     return a+b;
// }
// export const user="Anand";
// export const score=30;
// export const isPossible=true;
// export const hobbies=["chess","Dancing"];

//either this way
function sum(a,b){
    return a+b;
}
const user="Anand";
const score=30;
const isPossible=true;

export {sum,user,score,isPossible,hobbies}; //named exports


// default export
const hobbies=["chess","Dancing"];
export default hobbies;

