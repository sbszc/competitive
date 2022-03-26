const lines = ["1.0 0.0"];

const inputArr = lines[0].split(" ");
const x = Number(inputArr[0]);
const y = Number(inputArr[1]);

if (x > 0 && y > 0) {
    console.log("Q1");
} else if (x > 0 && y < 0) {
    console.log("Q4");
} else if (x < 0 && y > 0) {
    console.log("Q2");
} else if (x < 0 && y < 0) {
    console.log("Q3");
} else if (x === 0 && y !== 0) {
    console.log("Eixo Y");
} else if (x !== 0 && y === 0) {
    console.log("Eixo X");
} else if (x === 0 && y === 0) {
    console.log("Origem");
}
