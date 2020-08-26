package staff;

public abstract class Employee {

    private String name;
    private String NI;
    private int salary;

    public Employee(String name, String NI, int salary) {
        this.name = name;
        this.NI = NI;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNI() {
        return NI;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(double salaryIncrease) {
        this.salary += salaryIncrease;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

}
