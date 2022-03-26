const lines = ["2.0 4.0 7.5 8.0", "6.4"];

const inputArr = lines[0].split(" ");
const n1 = Number(inputArr[0]);
const n2 = Number(inputArr[1]);
const n3 = Number(inputArr[2]);
const n4 = Number(inputArr[3]);

const n1Weight = 2;
const n2Weight = 3;
const n3Weight = 4;
const n4Weight = 1;

let avg = (n1 * n1Weight + n2 * n2Weight + n3 * n3Weight
    + n4 * n4Weight) / (n1Weight + n2Weight + n3Weight + n4Weight);

console.log("Media: " + avg.toFixed(1));

if (7.0 <= avg) {
    console.log("Aluno aprovado.");
} else if (avg < 5.0) {
    console.log("Aluno reprovado.");
} else if (5.0 <= avg && avg <= 6.9) {
    console.log("Aluno em exame.");
    const nExam = Number(lines[1]);
    console.log("Nota do exame: " + nExam.toFixed(1));
    avg = (avg + nExam) / (2);
    if (5.0 <= avg) {
        console.log("Aluno aprovado.");
    } else {
        console.log("Aluno reprovado.");
    }
    console.log("Media final: " + avg.toFixed(1));
}