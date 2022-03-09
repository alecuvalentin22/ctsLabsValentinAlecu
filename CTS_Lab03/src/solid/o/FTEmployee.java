package solid.o;

public class FTEmployee extends Employee {
    private float salary;

    public FTEmployee(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public float calculateBonus() {
        return this.salary * 0.1f;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FTEmployee{" +
                super.toString() +
                "salary=" + salary +
                '}';
    }
}
