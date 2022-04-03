const lines = ["556"];

let seconds = Number(lines[0]);

const SECONDS_PER_MINUTE = 60;
const MINUTES_PER_HOUR = 60;
const SECONDS_PER_HOUR = SECONDS_PER_MINUTE * MINUTES_PER_HOUR;

let hours = Math.floor(seconds / SECONDS_PER_HOUR);
seconds %= SECONDS_PER_HOUR;
let minutes = Math.floor(seconds / SECONDS_PER_MINUTE);
seconds %= SECONDS_PER_MINUTE;

console.log(`${hours}:${minutes}:${seconds}`);