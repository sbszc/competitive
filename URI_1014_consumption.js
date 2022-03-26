const lines = ["500", "35.0"];

let distanceInKm = Number(lines[0]);
let fuelInL = Number(lines[1]);

let consumption = distanceInKm / fuelInL;

console.log(consumption.toFixed(3) + " km/l");