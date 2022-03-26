const lines = ["400"];

let n = Number(lines[0]);

const DAYS_PER_MONTH = 30;
const DAYS_PER_YEAR = 365;

let years = Math.floor(n / DAYS_PER_YEAR);
n -= years * DAYS_PER_YEAR;
let months = Math.floor(n / DAYS_PER_MONTH);
n -= months * DAYS_PER_MONTH;
let days = n;

console.log(years + " ano(s)");
console.log(months + " mes(es)");
console.log(days + " dia(s)");