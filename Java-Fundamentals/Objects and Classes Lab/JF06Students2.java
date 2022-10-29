package objectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JF06Students2 {
    static class Student{
        String firstName;
        String lastName;
        String age;
        String town;
        public Student(String firstName, String lastName, String age, String town){
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }

        public void setTown(String town) {
            this.town = town;
        }
        public void setAge(String age) {
            this.age = age;
        }
        @Override
        public String toString(){
            return String.format("%s %s is %s years old%n",
                    this.getFirstName(),
                    this.getLastName(),
                    this.getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Student> studentList = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")){
            String [] inputStudentArr = input.split(" ");
            String firstName = inputStudentArr[0];
            String lastName = inputStudentArr[1];
            String age = inputStudentArr[2];
            String town = inputStudentArr[3];

            Student student = new Student(firstName, lastName, age, town);
            int indexOfStudent = findStudentIndex(studentList, student.getFirstName(), student.getLastName());

            if (indexOfStudent!= -1){
                studentList.get(indexOfStudent).setTown(student.town);
                studentList.get(indexOfStudent).setAge(student.age);
            }else{
                studentList.add(student);
            }
            input = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();
        for (Student item : studentList) {
            if(item.getTown().equals(searchTown)){
                System.out.print(item);
            }
        }

    }
    static int findStudentIndex(List<Student>studentList,String firstName,String lastName){
        for (int i = 0; i < studentList.size(); i++) {
            String firstNameList = studentList.get(i).getFirstName();
            String lastNameList = studentList.get(i).getLastName();
            if(firstNameList.equals(firstName) && lastNameList.equals(lastName)){
                return i;
            }
        }
        return  -1;
    }
}
