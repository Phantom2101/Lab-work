import java.util.*;
 
class Person{
    String name;
    String DOB;//in format yyyy-mm-dd
    int height;
    int weight;
    String add;

    public Person(String name,String DOB,int height,int weight,String add){
        this.name=name;
        this.DOB=DOB;
        this.height=height;
        this.weight=weight;
        this.add=add;
    }
    void calculateAge(){
        int age = 2024 - Integer.parseInt(DOB.substring(0, 4));
        System.out.println("Age :"+age);
    }
    void Display(){
        System.out.println("Name: "+name);
        System.out.println("Date of Birth: "+DOB);
        System.out.println("Height: "+height+"cm");
        System.out.println("Weight: "+weight+"kg");
        System.out.println("Address: "+add);
        calculateAge();
        
    }  
}


class Student extends Person{
    int roll;
    int marks;
    

    public Student(String name,String DOB,int height,int weight,String add,int roll,int marks){
        super(name, DOB, height, weight, add);
        this.roll = roll;
        this.marks = marks;
    }
    void DisplayStudent(){
        super.Display();
        System.out.println("Roll No: "+roll);
        System.out.println("Marks: "+marks);
    }
}

class Employee extends Person{
    int empId;
    String designation;
    int salary;

    public Employee(String name,String DOB,int height,int weight,String add,int empId,String designation,int salary){
        super(name, DOB, height, weight, add);
        this.empId = empId;
        this.designation = designation;
        this.salary = salary;

    }
    void avgSalary()
         {
            // Tax slabs (AY 2022-23)
            double taxSlab1 = 250000; // 0% tax
            double taxSlab2 = 500000; // 5% tax
            double taxSlab3 = 750000; // 10% tax
            double taxSlab4 = 1000000; // 15% tax
            double taxSlab5 = 1250000; // 20% tax
            double taxSlab6 = 1500000; // 25% tax
        
            // Deductions
            double stdDeduction = 50000; // Standard deduction
            double hra = 0.5 * salary; // House Rent Allowance (HRA)
            double da = 0.2 * salary; // Dearness Allowance (DA)
        
            // Calculate taxable income
            double taxableIncome = salary - stdDeduction - hra - da;
        
            // Calculate income tax
            double incomeTax = 0;
            if (taxableIncome <= taxSlab1) {
                incomeTax = 0;
            } else if (taxableIncome <= taxSlab2) {
                incomeTax = (taxableIncome - taxSlab1) * 0.05;//ALl CALCULATIONS ACCORDING TO INDIAN TAX SYSTEM.
            } else if (taxableIncome <= taxSlab3) {
                incomeTax = (taxableIncome - taxSlab2) * 0.1 + 12500;
            } else if (taxableIncome <= taxSlab4) {
                incomeTax = (taxableIncome - taxSlab3) * 0.15 + 37500;
            } else if (taxableIncome <= taxSlab5) {
                incomeTax = (taxableIncome - taxSlab4) * 0.2 + 75000;
            } else if (taxableIncome <= taxSlab6) {
                incomeTax = (taxableIncome - taxSlab5) * 0.25 + 125000;
            } else {
                incomeTax = (taxableIncome - taxSlab6) * 0.3 + 200000;
            }
        
            // Calculate average salary
            double avgSalary = salary - incomeTax;
            System.out.println("Average Salary: " + avgSalary);
        }
    void DisplayEmployee(){
        super.Display();
        System.out.println("Employee ID :"+empId);
        System.out.println("Designation :"+designation);
        avgSalary();
    }
}

public class exp5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select your position:-\n1.Student\n2.Employee");
        int n = sc.nextInt();
        sc.nextLine();

        switch(n){
            case 1 : 
                System.out.println("Enter name:");
                String name = sc.nextLine();
                System.out.println("Enter Date of Birth:");
                String DOB = sc.nextLine();
                System.out.println("Enter your height (in cm):");
                int height = sc.nextInt();
                System.out.println("Enter your weight (in kg):");
                int weight = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter your address:");
                String add = sc.nextLine();
                System.out.println("Enter your roll number:");
                int roll = sc.nextInt();
                System.out.println("Enter your marks:");
                int marks = sc.nextInt();

                Student student = new Student(name, DOB, height, weight, add, roll, marks);
                student.DisplayStudent();
                break;

            case 2 : 
            System.out.println("Enter your name:");
            name = sc.nextLine();
            System.out.println("Enter your Date of Birth (yyyy-mm-dd):");
            DOB = sc.nextLine();
            System.out.println("Enter your height (in cm):");
            height = sc.nextInt();
            System.out.println("Enter your weight (in kg):");
            weight = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your address:");
            add = sc.nextLine();
            System.out.println("Enter your employee ID:");
            int empId = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter your designation:");
            String designation = sc.nextLine();
            System.out.println("Enter your salary:");
            int salary = sc.nextInt();

            Employee employee = new Employee(name, DOB, height, weight, add, empId, designation, salary);
            employee.DisplayEmployee();
            break;

            default : System.out.println("INVALID CHOICE!!");
        }
        sc.close();
    }
}