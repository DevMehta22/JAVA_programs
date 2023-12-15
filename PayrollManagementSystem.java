import java.util.Scanner;

class Employee {
    private String eName;
    private int basicSalary;
    
    public Employee() {
        eName = "";
        basicSalary = 0;
    }

    public Employee(String name, int bs) {
        eName = name;
        basicSalary = bs;
    }

    public Employee(Employee e) {
        eName = e.eName;
        basicSalary = e.basicSalary;
    }

    public String getEName() {
        return eName;
    }

    public void setEName(String name) {
        eName = name;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(int bs) {
        basicSalary = bs;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee Name: " + eName);
        System.out.println("Basic Salary: " + basicSalary);
    }

    public int getNetIncome() {
        return basicSalary;
    }

    public static int countEmployees() {
        return 0; 
    }
}

class SalesManager extends Employee {
    private int salesAmount;

    public SalesManager() {
        super();
        salesAmount = 0;
    }

    public SalesManager(String name, int bs, int sa) {
        super(name, bs);
        salesAmount = sa;
    }

    public int getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(int sa) {
        salesAmount = sa;
    }

    @Override
    public void printEmployeeDetails() {
        super.printEmployeeDetails();
        System.out.println("Sales Amount: " + salesAmount);
    }

    @Override
    public int getNetIncome() {
        int commission = (int) (salesAmount * 0.1);
        return super.getBasicSalary() + commission;
    }
}

public class PayrollManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create an Employee object
        Employee emp1 = new Employee("Dev", 500000);
        emp1.printEmployeeDetails();
        System.out.println("Net Income: " + emp1.getNetIncome());

        // Create a SalesManager object
        SalesManager sm1 = new SalesManager("Akshay", 70000, 100000);
        sm1.printEmployeeDetails();
        System.out.println("Net Income: " + sm1.getNetIncome());

        scanner.close();
    }
}

