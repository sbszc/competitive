const lines = ["JOAO", "500.00", "1230.30"];

let salary = Number(lines[1]);
let valueSold = Number(lines[2]);

let totalSalary = salary + valueSold * 0.15;

console.log("TOTAL = R$ " + totalSalary.toFixed(2));