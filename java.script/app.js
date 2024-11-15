const button = document.getElementById("myButton");

function buttonHandler(event) {
  console.log("Botó clicat!");
  console.log("Tipus d'esdeveniment:", event.type); // Output: click
  console.log("Element clicat:", event.target); // Output: <button id="myButton">
  console.log("Posició X del ratolí:", event.clientX); // Coordenada X del ratolí
  console.log("Posició Y del ratolí:", event.clientY); // Coordenada Y del ratolí
}

button.addEventListener("click", buttonHandler);

const inputField = document.getElementById("myInput");

function keypressHandler(event) {
  console.log("Tecla premuda:", event.key); // Output: Tecla premuda (ex: "a")
  console.log("Codi de tecla:", event.keyCode); // Output: Codi de tecla (ex: 65 per "A")
}

inputField.addEventListener("keypress", keypressHandler);

const form = document.getElementById("myForm");

function formSubmitHandler(event) {
  event.preventDefault(); // Evita que el formulari s'enviï realment
  console.log("Formulari enviat amb les següents dades:");
  console.log("Valor de l'input:", form.elements["username"].value);
}

form.addEventListener("submit", formSubmitHandler);
