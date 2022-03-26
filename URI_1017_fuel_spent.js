const lines = ["10", "85"];

let time = Number(lines[0]);
let speed = Number(lines[1]);
const PERFORMANCE = 12;

let liters = time * speed / PERFORMANCE;

console.log(liters.toFixed(3));