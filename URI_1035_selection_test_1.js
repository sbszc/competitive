const lines = ["5 6 7 8"];

const [a, b, c, d] = lines[0].split(" ");

if (b>c && d>a && c+d>a+b && c>=0 && d>=0 && a%2==0) {
    console.log("Valores aceitos");
} else {
    console.log("Valores nao aceitos");
}