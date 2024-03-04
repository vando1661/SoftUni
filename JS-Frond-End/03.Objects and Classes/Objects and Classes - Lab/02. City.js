function cityInfo (city){
  
let keys = Object.keys(city);
for (const key of keys) {
    console.log(`${key} -> ${city[key]}`)
}
// let keys = Object.entries(city);
// for (const [key, value] of keys) {
//     console.log(`${key} -> ${value}`)
// }
}
cityInfo(
{
name: "Sofia",
area: 492,
population: 1238438,
country: "Bulgaria",
postCode: "1000"
}
);