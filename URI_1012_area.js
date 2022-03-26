const lines = ["3.0 4.0 5.2"];

let inputArr = lines[0].split(" ");
let a = Number(inputArr[0]);
let b = Number(inputArr[1]);
let c = Number(inputArr[2]);
const PI = 3.14159;

let triangleArea = a * c / 2;
let circleArea = PI * c * c;
let trapeziumArea = (a + b) * c / 2;
let squareArea = b * b;
let rectangleArea = a * b;

console.log("TRIANGULO: " + triangleArea.toFixed(3));
console.log("CIRCULO: " + circleArea.toFixed(3));
console.log("TRAPEZIO: " + trapeziumArea.toFixed(3));
console.log("QUADRADO: " + squareArea.toFixed(3));
console.log("RETANGULO: " + rectangleArea.toFixed(3));