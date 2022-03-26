const lines = ["0.0 20.0 5.0"];

const inputArr = lines[0].split(" ");
let a = Number(inputArr[0]);
let b = Number(inputArr[1]);
let c = Number(inputArr[2]);

if (a === 0.0 || 4 * a * c > b * b) {
    console.log("Impossivel calcular");
} else {
    const r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    const r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

    console.log("R1 = " + r1.toFixed(5));
    console.log("R2 = " + r2.toFixed(5));
}