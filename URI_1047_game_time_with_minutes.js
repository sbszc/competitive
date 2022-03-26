const lines = ["7 10 8 9"];

const inputArr = lines[0].split(" ");
const MINUTES_PER_HOUR = 60;
const startMinute = Number(inputArr[0]) * MINUTES_PER_HOUR + Number(inputArr[1]);
const endMinute = Number(inputArr[2]) * MINUTES_PER_HOUR + Number(inputArr[3]);

let totalMinutes = 0;
if (startMinute < endMinute) {
    totalMinutes = endMinute - startMinute;
} else if (startMinute >= endMinute) {
    totalMinutes = endMinute + 24 * MINUTES_PER_HOUR - startMinute;
}

let totalHours = Math.floor(totalMinutes / MINUTES_PER_HOUR);
totalMinutes = totalMinutes % MINUTES_PER_HOUR;
console.log("O JOGO DUROU " + totalHours + " HORA(S) E " + totalMinutes + " MINUTO(S)");