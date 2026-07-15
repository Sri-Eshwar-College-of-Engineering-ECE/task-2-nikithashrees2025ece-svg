
abstract class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    Employee(int employeeId, String employeeName, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    abstract double calculateSalary();
}

class SoftwareEngineer extends Employee {
    SoftwareEngineer(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }

    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}

class TeamLeader extends Employee {
    TeamLeader(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }

    double calculateSalary() {
        return basicSalary + (basicSalary * 0.25);
    }
}

class ProjectManager extends Employee {
    ProjectManager(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
    }

    double calculateSalary() {
        return basicSalary + (basicSalary * 0.30);
    }
}

public class Payroll {
    public static void main(String[] args) {

        // Separate object creation
        SoftwareEngineer se = new SoftwareEngineer(101, "Arun", 40000);
        TeamLeader tl = new TeamLeader(201, "Deepa", 60000);
        ProjectManager pm = new ProjectManager(301, "nikitha", 90000);

        // Store objects in parent class array
        Employee[] emp = {se, tl, pm};

        // Display salary
        for (Employee e : emp) {
            System.out.println("ID : " + e.employeeId);
            System.out.println("Name : " + e.employeeName);
            System.out.println("Salary : ₹" + e.calculateSalary());
            System.out.println();
        }
    }
}