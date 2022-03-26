const lines = ["556"];

let n = Number(lines[0]);

const SECONDS_PER_MINUTE = 60;
const MINUTES_PER_HOUR = 60;

let hours = Math.floor(n / (SECONDS_PER_MINUTE * MINUTES_PER_HOUR));
n -= hours * SECONDS_PER_MINUTE * MINUTES_PER_HOUR;
let minutes = Math.floor(n / SECONDS_PER_MINUTE);
n -= minutes * SECONDS_PER_MINUTE;
let seconds = n;

console.log(`${hours}:${minutes}:${seconds}`);