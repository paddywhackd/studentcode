// add pageTitle
const pageTitle = "My Shopping List";
// add groceries
const groceries = ["pollo", "carneEsada", "candy", "carnitas", "flautas", "nerdropes", "cowtales", "filets", "bacon", "tortillas"]
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  let title = document.getElementById("title");
  title.innerText = pageTitle;
};

/**
* This function will loop over the array of groceries that was set above and add them to the DOM.
*/
function displayGroceries() {
  let groceryList = document.getElementById("groceries");
  groceries.forEach((item) => {
    let food = document.createElement("li");
    food.setAttribute("id", "item");
    food.innerText = item;
    groceryList.insertAdjacentElement("beforeend", food);
  });
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  let groceryList = document.getElementById("groceries");
  groceries.forEach((item) => {
    let completed = document.getElementById("item");
    completed.setAttribute("class", "completed");
    groceryList.appendChild(completed);
  });
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
