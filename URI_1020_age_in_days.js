const lines = ["400"];

let days = Number(lines[0]);

const DAYS_PER_MONTH = 30;
const DAYS_PER_YEAR = 365;

let years = Math.floor(days / DAYS_PER_YEAR);
days %= DAYS_PER_YEAR;
let months = Math.floor(days / DAYS_PER_MONTH);
days %= DAYS_PER_MONTH;

console.log(years + " ano(s)");
console.log(months + " mes(es)");
console.log(days + " dia(s)");