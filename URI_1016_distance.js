const lines = ["7"];

let distance = Number(lines[0]);
let xVelocity = 60;
let yVelocity = 90;

const MINUTES_PER_HOUR = 60;
let timeInMinutes = distance / (yVelocity - xVelocity) * MINUTES_PER_HOUR;

console.log(timeInMinutes + " minutos");