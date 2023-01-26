package _12DefiningClassesExercises.JA07Google;

public class Company {
    String companyName;
    String companyDepartment;
    double salary;

    public Company(String companyName, String companyDepartment, double salary) {
        this.companyName = companyName;
        this.companyDepartment = companyDepartment;
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyDepartment() {
        return companyDepartment;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f",companyName,companyDepartment,salary);
    }
}
