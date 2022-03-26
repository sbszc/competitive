const lines = ["7.0 5.0 7.0"];

const inputArr = lines[0].split(" ");
let a = Number(inputArr[0]);
let b = Number(inputArr[1]);
let c = Number(inputArr[2]);

const arrToSort = [ a, b, c ];
arrToSort.sort((a, b) => b - a);
a = arrToSort[0];
b = arrToSort[1];
c = arrToSort[2];

if (a >= b + c) {
    console.log("NAO FORMA TRIANGULO");
    return;
}

const aSqr = a * a, bSqrPlusCSqr = b * b + c * c;
if (aSqr === bSqrPlusCSqr) {
    console.log("TRIANGULO RETANGULO");
} else if (aSqr > bSqrPlusCSqr) {
    console.log("TRIANGULO OBTUSANGULO");
} else if (aSqr < bSqrPlusCSqr) {
    console.log("TRIANGULO ACUTANGULO");
}

if (a === b && b === c) {
    console.log("TRIANGULO EQUILATERO");
} else if ((a === b && a !== c) || (b === c && b !== a) || (c === a && c !== b)) {
    console.log("TRIANGULO ISOSCELES");
}
