function schoolRegister(input) {
  const register = {};
  for (const line of input) {
    let nameToken = line.split(",")[0];
    let name = nameToken.split(": ")[1];
    let gradeToken = line.split(",")[1];
    let grade = Number(gradeToken.split(": ")[1]);
    let scoreToken = line.split(",")[2];
    let averageScore = Number(scoreToken.split(": ")[1]);

    if (averageScore >= 3.0) {
      if (!register.hasOwnProperty(grade)) {
        register[grade] = [{ averageScore, name }];
      } else {
        register[grade].push({ averageScore, name });
      }
    }
  }
  for (let [grade, student] of Object.entries(register)) {
    let newYear = Number(grade) + 1;
    let countStudents = student.length;
    console.log(`${newYear} Grade`);
    let studentNames = [];
    for (const iterator of student) {
      let names = iterator.name;
      studentNames.push(names);
    }

    console.log(`List of students: ${studentNames.join(", ")}`);
    let totalScore = 0;
    for (const lines of student) {
      let currentScore = lines.averageScore;
      totalScore += currentScore;
    }

    console.log(
      `Average annual score from last year: ${(
        totalScore / countStudents
      ).toFixed(2)}\n`
    );
  }
}
schoolRegister([
  "Student name: Mark, Grade: 8, Graduated with an average score: 4.75",
  "Student name: Ethan, Grade: 9, Graduated with an average score: 5.66",
  "Student name: George, Grade: 8, Graduated with an average score: 2.83",
  "Student name: Steven, Grade: 10, Graduated with an average score: 4.20",
  "Student name: Joey, Grade: 9, Graduated with an average score: 4.90",
  "Student name: Angus, Grade: 11, Graduated with an average score: 2.90",
  "Student name: Bob, Grade: 11, Graduated with an average score: 5.15",
  "Student name: Daryl, Grade: 8, Graduated with an average score: 5.95",
  "Student name: Bill, Grade: 9, Graduated with an average score: 6.00",
  "Student name: Philip, Grade: 10, Graduated with an average score: 5.05",
  "Student name: Peter, Grade: 11, Graduated with an average score: 4.88",
  "Student name: Gavin, Grade: 10, Graduated with an average score: 4.00",
]);
