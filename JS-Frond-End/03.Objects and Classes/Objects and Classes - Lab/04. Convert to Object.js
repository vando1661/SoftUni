function convertToObject(jsonStr){
    let person = JSON.parse(jsonStr);
    for (const kye in person) {
        console.log(`${kye}: ${person[kye]}`)
    }
}
convertToObject('{"name": "George", "age": 40, "town": "Sofia"}');