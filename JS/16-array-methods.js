//add element
var list=[45,55,55,12,44];
//create/add --> O(1) - push 
//create/add --> O(n) -unshift

console.log(list);

//push will add in the end position
list.push(11);
console.log(list);
//unshift will add the value in front position
list.unshift(33);
console.log(list);

//remove
var list=[45,55,55,12,44];
//remove-O(1) - pop
//remove-O(n) - shift

//removing value at the end position
list.pop();
console.log(list);
//removing value at the first position
list.shift();
console.log(list);
//length
console.log(list.length);

        //splice
var list=[45,55,11,12,44,31];
//splice will remove the element at any position
//it will change the original array
//we have two argument
//first one is index start from zero
//second is number of elements
console.log(list);
list.splice(2,2);//middle 2 elements will be removed
console.log(list);

        //slice
var list=[45,55,11,12,44,31];
//slice will remove the element at any position
//it will not change the original array
//we have two argument
//first one is index start from zero
//second is element name that will start from one.
console.log(list);
var result = list.slice(1,3);//55 and 11 will be output
console.log(result);
console.log(list);
        //concat
var list=[45,55,11,12,44,31];
var listTwo=[23,42];
//it will not change the original array
//it will combine together in new array
var result = list.concat(listTwo);
console.log(result);

        //reverse
var list=[1,2,3,4,5];
console.log(list);
//reverse the array
list.reverse();
console.log(list);

        //includes
var list=[45,55,11,12,44,31];
//includes it will return boolean value true or false 
//if element is present inside the array it will return true.
//if element is not present inside the array it will return false.
var result = list.includes(1);
console.log(result);

        // indexOf
var list=[11,22,33,44,22,44,67];
//indexOf --> it will return the index value of that particular element if it is present.
//indexOf --> if element is not found it will return -1
var result = list.indexOf(33);
console.log(result);

        //lastIndexOf

var list=[11,22,33,44,22,44,67];
//indexOf --> it will return the index value of that particular element last occurance.
//indexOf --> if element is not found it will return -1
var result = list.lastIndexOf(22);
console.log(result);

        //array to string

//toString method-
var list=[44,55,22,112];
var result = list.toString();
console.log(typeof result,result);//final result will be comma separated value.
//join method
    var list=[44,55,22,112];
    var result = list.join();//final result will be comma separated value.
    console.log(typeof result,result);

    var list=[44,55,22,112];
    var result = list.join('');//here final result will be 445522112.
    console.log(typeof result,result);

    var list=[44,55,22,112];
    var result = list.join(' ');//here final result will be 44 55 22 112.
    console.log(typeof result,result);

    var list=[44,55,22,112];
    var result = list.join('-');
    console.log(typeof result,result);