const lines = ["6.0 4.0 2.1"];

const inputArr = lines[0].split(" ");
const a = Number(inputArr[0]);
const b = Number(inputArr[1]);
const c = Number(inputArr[2]);

if (a+b>c && a+c>b && b+c>a) {
    const trianglePerimeter = a + b + c;
    console.log(`Perimetro = ${trianglePerimeter.toFixed(1)}`);
} else {
    const trapeziumArea = (a + b) * c / 2;
    console.log(`Area = ${trapeziumArea.toFixed(1)}`);
}
