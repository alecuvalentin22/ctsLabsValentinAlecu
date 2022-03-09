package solid.o;

public class VendorEmployee extends Employee {

    private float salary;

    public VendorEmployee(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public float calculateBonus() {
        return this.salary * .05f;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "VendorEmployee{" +
                super.toString() +
                "salary=" + salary +
                '}';
    }
}
