const lines = ["25", "100", "5.50"];

let emplNumber = lines[0];
let workedHoursPerMonth = lines[1];
let salaryPerHour = lines[2];

let salaryPerMonth = salaryPerHour * workedHoursPerMonth;

console.log("NUMBER = " + emplNumber);
console.log("SALARY = U$ " + salaryPerMonth.toFixed(2));