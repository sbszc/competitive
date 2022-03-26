const lines = ["16 2"];

const inputArr = lines[0].split(" ");
const startHour = Number(inputArr[0]);
const endHour = Number(inputArr[1]);

let totalHours = 0;
if (startHour < endHour) {
    totalHours = endHour - startHour;
} else if (startHour >= endHour) {
    totalHours = endHour + 24 - startHour;
}
console.log(`O JOGO DUROU ${totalHours} HORA(S)`);