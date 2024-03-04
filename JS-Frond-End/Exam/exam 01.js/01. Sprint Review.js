function sprintReview(input) {
  let number = Number(input.shift());
  let assigneeObj = {};
  let toDo = 0;
  let inProgress = 0;
  let codeReview = 0;
  let donePoints = 0;
  for (let index = 0; index < number; index++) {
    let [name, taskId, title, status, estimatedPoints] = input
      .shift()
      .split(":");

    if (name in assigneeObj) {
      assigneeObj[name].push({ taskId, title, status, estimatedPoints });
    } else {
      assigneeObj[name] = [{ taskId, title, status, estimatedPoints }];
    }
  }
  for (const line of input) {
    let commandToke = line.split(":");
    let commands = commandToke[0].split(" ");
    let command = commands[0];
    if (command === "Add") {
      let assignee = commandToke[1];
      let taskId = commandToke[2];
      let title = commandToke[3];
      let status = commandToke[4];
      let estimatedPoints = Number(commandToke[5]);
      if (assignee in assigneeObj) {
        assigneeObj[assignee].push({
          taskId,
          title,
          status,
          estimatedPoints,
        });
      } else {
        console.log(`Assignee ${assignee} does not exist on the board!`);
      }
    } else if (command === "Change") {
      let assignee = commandToke[1];
      let taskId = commandToke[2];
      let newStatus = commandToke[3];

      if (assignee in assigneeObj) {
        for (const task of assigneeObj[assignee]) {
          if (task.taskId === taskId) {
            task.status = newStatus;
            break;
          } else {
            console.log(
              `Task with ID ${taskId} does not exist for ${assignee}!`
            );
          }
        }
      } else {
        console.log(`Assignee ${assignee} does not exist on the board!`);
      }
    } else if (command === "Remove") {
      let assignee = commandToke[1];
      let taskIdIndex = Number(commandToke[2]);
      if (assignee in assigneeObj) {
        if (taskIdIndex >= 0 && taskIdIndex < assigneeObj[assignee].length) {
          assigneeObj[assignee].splice(taskIdIndex, 1);
        } else {
          console.log(`Index is out of range!`);
        }
      } else {
        console.log(`Assignee ${assignee} does not exist on the board!`);
      }
    }
  }
  for (const name of Object.values(assigneeObj)) {
    for (const task of name) {
      if (task.status === "ToDo") {
        toDo += Number(task.estimatedPoints);
      } else if (task.status === "In Progress") {
        inProgress += Number(task.estimatedPoints);
      } else if (task.status === "Code Review") {
        codeReview += Number(task.estimatedPoints);
      } else if (task.status === "Done") {
        donePoints += Number(task.estimatedPoints);
      }
    }
  }
  console.log(`ToDo: ${toDo}pts`);
  console.log(`In Progress: ${inProgress}pts`);
  console.log(`Code Review: ${codeReview}pts`);
  console.log(`Done Points: ${donePoints}pts`);
  if (donePoints >= inProgress + codeReview + toDo) {
    console.log("Sprint was successful!");
  } else {
    console.log("Sprint was unsuccessful...");
  }
}
sprintReview([
  "5",
  "Kiril:BOP-1209:Fix Minor Bug:ToDo:3",
  "Mariya:BOP-1210:Fix Major Bug:In Progress:3",
  "Peter:BOP-1211:POC:Code Review:5",
  "Georgi:BOP-1212:Investigation Task:Done:2",
  "Mariya:BOP-1213:New Account Page:In Progress:13",
  "Add New:Kiril:BOP-1217:Add Info Page:In Progress:5",
  "Change Status:Peter:BOP-1290:ToDo",
  "Remove Task:Mariya:1",
  "Remove Task:Joro:1",
]);

