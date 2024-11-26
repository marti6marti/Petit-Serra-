const addTask = document.getElementById("add-task");
const taskContainer = document.getElementById("task-container");
const inputTask = document.getElementById("input-task");

addTask.addEventListener("click", function () {
  if (inputTask.value === "") {
    alert("Si us plau, introdueix una tasca");
    return; // Salir de la función si la tarea está vacía
  }

  let task = document.createElement("div");
  task.classList.add("task");

  let li = document.createElement("li");
  li.innerText = `${inputTask.value}`;
  task.appendChild(li);

  let checkButton = document.createElement("button");
  checkButton.innerHTML = '<i class="fa-solid fa-check"></i>'; // Corregido aquí
  checkButton.classList.add("checkTask");
  task.appendChild(checkButton);

  let deleteButton = document.createElement("button");
  deleteButton.innerHTML = '<i class="fa-solid fa-trash-can"></i>';
  deleteButton.classList.add("deleteTask");
  task.appendChild(deleteButton);

  // Agregar evento para eliminar la tarea
  deleteButton.addEventListener("click", function () {
    taskContainer.removeChild(task);
  });

  // Agregar evento para marcar/desmarcar la tarea
  checkButton.addEventListener("click", function () {
    li.classList.toggle("completed");
  });

  taskContainer.appendChild(task);
  inputTask.value = "";
});