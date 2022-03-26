const lines = ["7 14 106"];

let inputArr = lines[0].split(" ");
let val1 = Number(inputArr[0]);
let val2 = Number(inputArr[1]);
let val3 = Number(inputArr[2]);

let higher1 = higher(val1, val2); 
let higher2 = higher(higher1, val3);

console.log(higher2 + " eh o maior");

function higher(a, b) {
    return (a + b + Math.abs(a - b)) / 2;
}