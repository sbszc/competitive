const lines = ["2 3"];

const items = new Map();
items.set(1, 4);
items.set(2, 4.5);
items.set(3, 5);
items.set(4, 2);
items.set(5, 1.5);

const inputArr = lines[0].split(" ");
const itemCode = Number(inputArr[0]);
const amount = Number(inputArr[1]);

const total =  items.get(itemCode) * amount;

console.log(`Total: R$ ${total.toFixed(2)}`);