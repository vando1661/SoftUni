package Java_OOP._03EncapsulationLab;

import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public  Person(String firstName, String lastName, int age,double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }
    public void setFirstName(String firstName){
        ensureNameLength(firstName,"First");
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        ensureNameLength(lastName,"Last");
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age <=0){
                throw  new IllegalStateException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public void setSalary(double salary) {
        if(salary < 460){
            throw new IllegalStateException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public  String getFirstName() {
        return firstName;
    }

    public  String getLastName() {
        return lastName;
    }

    public  int getAge() {
        return age;
    }

    public  double getSalary() {
        return salary;
    }

    private  void ensureNameLength(String name,String messagePrefix){
        if(name.length() < 3){
            throw new IllegalStateException(messagePrefix + " name cannot be less than 3 symbols");
        }
    }

    public void increaseSalary(double bonus){
        if(this.getAge() < 30){
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 200));
        }else {
            this.setSalary(this.getSalary() + (this.getSalary() * bonus / 100));
        }

    }


    @Override
    public String toString() {
        return String.format("%s %s gets %.1f leva", firstName, lastName,salary);
    }
}
