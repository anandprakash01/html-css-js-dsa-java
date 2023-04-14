// named export
// import {sum, user as anand} from './helper.js';

//for default export
// import hobbies from './helper.js';
// import anyName from './helper.js';

// for both
// import anyName,{sum, user as anand, isPossible} from './helper.js';


// const res=sum(3,5);
// console.log(res);
// console.log(anand);

// console.log(anyName);

//for importing all at once
import * as user from './helper.js';    //this will return as object
console.log(user);
console.log(user.score);