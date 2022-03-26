const lines = ["10.0", "10.0", "10.0"];

let a = lines[0];
let b = lines[1];
let c = lines[2];
let a_weight = 2.0;
let b_weight = 3.0;
let c_weight = 5.0;
let avg = (a * a_weight + b * b_weight + c * c_weight) / (a_weight + b_weight + c_weight);

console.log("MEDIA = "+avg.toFixed(1));