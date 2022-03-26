const lines = ["6 25"];

const inputArr = lines[0].split(" ");
const a = Number(inputArr[0]);
const b = Number(inputArr[1]);

if (a%b===0 || b%a===0) {
    console.log(`Sao Multiplos`);
} else {
    console.log(`Nao sao Multiplos`);
}
