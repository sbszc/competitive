const lines = ["576"];

let n = Number(lines[0]);
const notes = [100, 50, 20, 10, 5, 2, 1];

console.log(n);
for (let note of notes) {
    let quantity = Math.floor(n / note);
    n -= note * quantity;
    console.log(quantity + " nota(s) de R$ " + note.toFixed(2).replace(".", ","));
}