const lines = ["10.0", "10.0"];

let a = lines[0];
let b = lines[1];
let a_weight = 3.5;
let b_weight = 7.5;
let avg = (a * a_weight + b * b_weight) / (a_weight + b_weight);

console.log("MEDIA = "+avg.toFixed(5));