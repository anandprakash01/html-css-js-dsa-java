var list = [45, 33, 11, 23, 44];
var result = list.reduce(function (a, b) {
    a = a + b
    return a;
});
//45+33 = 78
//78+11=89
//89+23=112
//112+44=156
console.log(result);

var list = [2, 4, 1, 9, 25];//find max 
// reduce takes 2 arguments, second is initial value of accumulator
// second argument could be anything eg Array,object

const max = list.reduce((acc, curr) => {//by default acc is zero
    return Math.max(acc, curr);
})
console.log(max);

