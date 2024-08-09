
/*Title: Create a class called Employee that includes three pieces of information as instance
variables- first name, a last name and a monthly salary. Your class should have a
constructor that initializes the three instance variables. Provide a set and a get method for
each instance variable. If the monthly salary is not positive, set it to 0.0. Write a test
application named EmployeeTest that demonstrates class Employee's capabilities. Create
two Employee objects and display each object's yearly salary. Then give each Employee a
10% raise and display each Employee's yearly salary again. */
import java.util.*;

class Employee {
    String fname;
    String lname;
    double salary;

    public Employee(String fname, String lname, double salary) {
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
    }

    public void getEmployee() {
        System.out.println("Full name of Employee: " + fname + " " + lname);
        System.out.println("Monthly Salary of Employee :" + salary);
    }

    public void setEmployee(String fname, String lname, double salary) {
        this.fname = fname;
        this.lname = lname;
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }

    }

    public void incrementSalary() {
        this.salary = this.salary * 1.1;
        System.out.println(this.salary);
    }
}

public class exp3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First name :");
        String fname = sc.nextLine();
        System.out.println("Enter Last name :");
        String lname = sc.nextLine();
        System.out.println("Enter Salary :");
        double salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("\n");
        Employee emp1 = new Employee(fname, lname, salary);
        emp1.getEmployee();

        System.out.println("\nEnter First name :");
        fname = sc.nextLine();
        System.out.println("Enter Last name :");
        lname = sc.nextLine();
        System.out.println("Enter Salary :");
        salary = sc.nextDouble();
        sc.nextLine();
        System.out.println("\n");
        Employee emp2 = new Employee(fname, lname, salary);
        emp2.getEmployee();

        System.out.println(
                "\nAfter incrementing the salary by 10%,the salary for employee 1 and employee 2 respectively is:-\n");
        emp1.incrementSalary();

        System.out.println("and");

        emp2.incrementSalary();

        sc.close();
    }

}