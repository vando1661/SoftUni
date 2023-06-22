package Java_OOP._01WorkingWithAbstraction_Lab.jo03StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentSystem;

    public StudentSystem() {
        this.studentSystem = new HashMap<>();
    }

    public Map<String, Student> getStudentSystem() {
        return this.studentSystem;
    }

    public void findStudent(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String[] args = scanner.nextLine().split(" ");
        String firstArgument = args[0];
        String studentName = args[1];

        if (firstArgument.equals("Create")) {
            int studentAge = Integer.parseInt(args[2]);
            double studentGrade = Double.parseDouble(args[3]);
            if (!studentSystem.containsKey(studentName)) {
                var student = new Student(studentName, studentAge, studentGrade);
                studentSystem.put(studentName, student);
            }
        } else if (firstArgument.equals("Show")) {
            if (studentSystem.containsKey(studentName)) {
                StringBuilder sb = new StringBuilder();
                Student student = studentSystem.get(studentName);
                sb.append(String.format("%s is %s years old.", student.getName(), student.getAge()));

                if (student.getGrade() >= 5.00) {
                    sb.append(" Excellent student.");
                } else if (student.getGrade() < 5.00 && student.getGrade() >= 3.50) {
                    sb.append(" Average student.");
                } else {
                    sb.append(" Very nice person.");
                }

                System.out.println(sb.toString());
            }
        }
    }
}
