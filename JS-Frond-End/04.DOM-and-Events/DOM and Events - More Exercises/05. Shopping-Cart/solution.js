function solve() {
  let buttons = Array.from(document.getElementsByClassName("add-product"));
  let checkoutBtn = document.querySelector(".checkout");
  let textArea = document.querySelector("body > div > textarea");

  let car = [];
  let totalPrice = 0;

  for (const button of buttons) {
    button.addEventListener("click", (e) => {
      let productDiv = e.target.parentElement.parentElement;
      let prodName = productDiv.querySelector(".product-title").textContent;
      let price = Number(
        productDiv.querySelector(".product-line-price").textContent
      );
      addCar(prodName, price);
    });
  }
  function addCar(name, price) {
    car.push({ name, price });
    totalPrice += price;
    textArea.value += `Added ${name} for ${price.toFixed(2)} to the cart.\n`;
  }
  checkoutBtn.addEventListener("click", checkout);
  function checkout() {
    let uniqueProducts = [...new Set(car.map((product) => product.name))];
    textArea.value += `You bought ${uniqueProducts.join(
      ", "
    )} for ${totalPrice.toFixed(2)}.\n`;

    buttons.forEach((button) => {
      button.disabled = true;
    });
    checkoutBtn.disabled = true;
  }
}
