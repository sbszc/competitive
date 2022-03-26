const lines = ["10.01"];

const banknotes = [ 100, 50, 20, 10, 5, 2 ];
const coins = [ 1.0, 0.5, 0.25, 0.1, 0.05, 0.01 ];

const money = Number(lines[0]);

const SHIFT = 100;
let safeMoney = money * SHIFT;

console.log("NOTAS:");
for (let banknote of banknotes) {
    const safeBanknote = banknote * SHIFT;
    const quantity = Math.floor(safeMoney / safeBanknote);
    safeMoney %= safeBanknote; 
    console.log(`${quantity} nota(s) de R$ ${banknote.toFixed(2)}`);
}

console.log("MOEDAS:");
for (let coin of coins) {
    const safeCoin = coin * SHIFT;
    const quantity = Math.floor(safeMoney / safeCoin);
    safeMoney %= safeCoin;
    console.log(`${quantity} moeda(s) de R$ ${coin.toFixed(2)}`);
}