const lines = ["7 21 -14"];

const inputArr = lines[0].split(" ");
const a = Number(inputArr[0]);
const b = Number(inputArr[1]);
const c = Number(inputArr[2]);

const arrToSort = [a, b, c];
arrToSort.sort(function(a, b){return a - b});

console.log(arrToSort[0]);
console.log(arrToSort[1]);
console.log(arrToSort[2]);
console.log();
console.log(a);
console.log(b);
console.log(c);
