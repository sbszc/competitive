const lines = [
    '4', 
    '1 / 2 + 3 / 4',
    '1 / 2 - 3 / 4', 
    '2 / 3 * 6 / 6',
    '1 / 2 / 3 / 4'
]

const N = Number(lines[0]);
for (let i = 0; i < N; i++) {
    const line = lines[i + 1].split(' ');

    const n1 = Number(line[0]);
    const d1 = Number(line[2]);
    const operator = line[3];
    const n2 = Number(line[4]);
    const d2 = Number(line[6]);

    let n = 0, d = 0;
    switch(operator){
        case '+':
            n = n1 * d2 + n2 * d1;
            d = d1 * d2;
            break;
        case '-':
            n = n1 * d2 - n2 * d1;
            d = d1 * d2;
            break;
        case '*':
            n = n1 * n2;
            d = d1 * d2;
            break;
        case '/':
            n = n1 * d2;
            d = d1 * n2;
            break;
    }

    let nReduced = 0, dReduced = 0;
    let initMcd = Math.abs(n);
    if (Math.abs(d) < initMcd) {
        initMcd = Math.abs(d);
    }

    for (let mcd = initMcd; mcd >= 2; mcd--) {
        if (n % mcd == 0 && d % mcd == 0) {
            nReduced = n / mcd;
            dReduced = d / mcd;
            break;
        }
    }	

    if (nReduced == 0) {
        nReduced = n;
        dReduced = d;
    }
    console.log(`${n}/${d} = ${nReduced}/${dReduced}`);
}