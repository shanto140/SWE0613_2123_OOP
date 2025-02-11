package PRactice_Problem_08;
class Employee {
    public String name;
    public int id;
    public String department;


    public Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }


    public double calculatePay() {
        System.out.println("Calculating pay for : " + this.name);
        return 0.0;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Department: " + this.department);
    }
}


class FullTimeEmployee extends Employee {
    private double Salary;


    public FullTimeEmployee(String name, int id, String department, double Salary) {
        super(name, id, department);
        this.Salary = Salary;
    }



    public double calculatePay() {
        System.out.println("Calculating pay for full-time employee: " + this.name);
        return this.Salary;
    }
}


class PartTimeEmployee extends Employee {
    private double hourRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, String department, double hourRate, int hoursWorked) {
        super(name, id, department);
        this.hourRate = hourRate;
        this.hoursWorked = hoursWorked;
    }


    @Override
    public double calculatePay() {
        System.out.println("Calculating pay for part-time employee: " + this.name);
        return this.hourRate * this.hoursWorked;
    }
}


class ContractEmployee extends Employee {
    private String projectName;
    private double contractAmount;


    public ContractEmployee(String name, int id, String department, String projectName, double contractAmount) {
        super(name, id, department);
        this.projectName = projectName;
        this.contractAmount = contractAmount;
    }


    public double calculatePay() {
        System.out.println("Calculating pay for contract employee: " + this.name);
        return this.contractAmount; // Contract employees receive a fixed contract amount
    }
}

class PracticeProblem08 {
    public static void main(String[] args) {

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Alice", 101, "HR", 5000.0);
        fullTimeEmployee.displayEmployeeDetails();
        System.out.println("Pay: $" + fullTimeEmployee.calculatePay());


        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("Bob", 102, "IT", 20.0, 80);
        partTimeEmployee.displayEmployeeDetails();
        System.out.println("Pay: $" + partTimeEmployee.calculatePay());


        ContractEmployee contractEmployee = new ContractEmployee("Charlie", 103, "Finance", "Project X", 10000.0);
        contractEmployee.displayEmployeeDetails();
        System.out.println("Pay: $" + contractEmployee.calculatePay());
    }
}