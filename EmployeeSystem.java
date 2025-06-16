// EmployeeSystem.java (Ques 5)

class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public double getBaseSalary() {
        return salary;
    }

    public double calculateSalary() {
        return salary;
    }
}

// Manager subclass with bonus only
class Manager extends Employee {
    private double bonus;

    public Manager(String name, int id, double baseSalary, double bonus) {
        super(name, id, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }
}

// Developer subclass with overtime pay only
class Developer extends Employee {
    private int overtimeHours;
    private final double OVERTIME_RATE = 50;

    public Developer(String name, int id, double baseSalary, int overtimeHours) {
        super(name, id, baseSalary);
        this.overtimeHours = overtimeHours;
    }

    public int getOvertimeHours() {
        return overtimeHours;
    }
    public void setOvertimeHours(int overtimeHours) {
        this.overtimeHours = overtimeHours;
    }

    @Override
    public double calculateSalary() {
        return getBaseSalary() + (overtimeHours * OVERTIME_RATE);
    }
}

// Demo class
public class EmployeeSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", 101, 50000, 15000);
        Employee developer = new Developer("Bob", 102, 40000, 10);

        System.out.println("Manager " + manager.getName() + " salary: " + manager.calculateSalary());
        System.out.println("Developer " + developer.getName() + " salary: " + developer.calculateSalary());
    }
}