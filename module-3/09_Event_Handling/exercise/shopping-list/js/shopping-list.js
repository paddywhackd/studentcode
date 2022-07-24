let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}

document.addEventListener('DOMContentLoaded', () => {
  setPageTitle();
  displayGroceries();
  const names = document.querySelectorAll('li');
  names.forEach((name) => {
    name.addEventListener('click', () => {
      if (!name.classList.contains('completed')) {
        name.classList.add('completed');
      }
    });
    // when you double click a task remove the completed class
    name.addEventListener('dblclick', () => {
      if (name.classList.contains('completed')) {
        name.classList.remove('completed');
      }
    });
  });
  button = document.querySelector('.btn')
  const allItems = document.querySelectorAll('li');
  button.addEventListener('click', () => {
    if (allItemsIncomplete) {
      allItemsIncomplete = false;
      allItems.forEach((name) => { name.classList.add('completed') });
      button.innerText = "Mark All Incomplete";
    }
    else {
      allItemsIncomplete = true;
      allItems.forEach((name) => { name.classList.remove('completed') });
      button.innerText = "Mark All Complete";
    }
  })

})