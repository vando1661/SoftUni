package objectsAndClassesExercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class JF07OrderByAge {
    static class  Person{
        private String name;
        private int id;
        private int age;
        public Person (String name,int id,int age){
            this.name = name;
            this.id = id;
            this.age = age;
        }
        public  int getAge(){
            return this.age;
        }
        @Override
        public String toString(){
            return String.format("%s with ID: %d is %d years old.",this.name,this.id,this.age);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String text = scanner.nextLine();
        List<Person> personList = new ArrayList<>();
        while (!text.equals("End")){
            String name = text.split(" ")[0];
            int id = Integer.parseInt(text.split(" ")[1]);
            int age = Integer.parseInt(text.split(" ")[2]);

            Person person = new Person(name,id ,age);
            personList.add(person);
            text = scanner.nextLine();
        }
        personList.sort(Comparator.comparingInt(Person :: getAge));
        for (Person person:personList) {
            System.out.println(person.toString());
        }
    }
}
