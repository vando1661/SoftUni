function shoppingList(input) {
  let items = input.shift().split("!");
  for (const line of input) {
    if (line.includes("Go Shopping!")) {
      console.log(items.join(", "));
      return;
    }
    let command = line.split(" ")[0];
    if (command === "Urgent") {
      let item = line.split(" ")[1];
      if (!items.includes(item)) {
        items.unshift(item);
      }
    } else if (command === "Unnecessary") {
      let item = line.split(" ")[1];
      if (items.includes(item)) {
        let indexItem = items.indexOf(item);
        items.splice(indexItem, 1);
      }
    } else if (command === "Correct") {
      let item = line.split(" ")[1];
      let newItem = line.split(" ")[2];

      if (items.includes(item)) {
        let indexItem = items.indexOf(item);
        items.splice(indexItem, 1, newItem);
      }
    } else if (command === "Rearrange") {
      let item = line.split(" ")[1];
      if (items.includes(item)) {
        let indexItem = items.indexOf(item);
        items.splice(indexItem, 1);
        items.push(item);
      }
    }
  }
}
shoppingList([
  "Milk!Pepper!Salt!Water!Banana",
  "Urgent Salt",
  "Unnecessary Grapes",
  "Correct Pepper Onion",
  "Rearrange Grapes",
  "Correct Tomatoes Potatoes",
  "Go Shopping!",
]);
