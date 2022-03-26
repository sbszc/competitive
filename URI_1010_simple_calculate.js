const lines = ["12 1 5.30", "16 2 5.10"];

let prod1 = lines[0].split(" ");
let prod2 = lines[1].split(" ");

let valueToPay = Number(prod1[1]) * Number(prod1[2])
+ Number(prod2[1]) * Number(prod2[2]);

console.log("VALOR A PAGAR: R$ " + valueToPay.toFixed(2));