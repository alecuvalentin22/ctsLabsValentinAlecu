package solid.o;

public abstract class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ']';
    }

    abstract float calculateBonus();


    /*@Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeType='" + employeeType + '\'' +
                '}';
    }*/

   /* @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", employeeType='" + employeeType + '\'' +
                ", salary=" + salary +
                '}';
    }*/

    /*public float calculateBonus() {
        if (this.employeeType.equals("FTE")) {
            return this.salary * .1f;
        }

        if (this.employeeType.equals("Vendor")) {
            return this.salary * .05f;
        }

        return 0;
    }*/
}
