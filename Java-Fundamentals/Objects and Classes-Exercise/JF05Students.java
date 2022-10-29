package objectsAndClassesExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JF05Students {
     static class Student{
        private String name;
        private String lastName;
        private double grade;
        public Student(String name,String lastName, double grade){
            this.name = name;
            this.lastName = lastName;
            this.grade = grade;
        }
        public double getGrade(){
            return this.grade;
        }
        @Override
         public String toString(){
            return String.format("%s %s: %.2f",this.name,this.lastName,this.grade);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Student> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int count = 1; count <=n; count++) {
            String personalData = scanner.nextLine();
            String name = personalData.split(" ")[0];
            String lastName = personalData.split(" ")[1];
            double grade = Double.parseDouble(personalData.split(" ")[2]);


            Student student = new Student(name, lastName, grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparingDouble(Student ::getGrade)
                .reversed());
        for (Student student:studentList) {
            System.out.println(student.toString());

        }
    }
}
