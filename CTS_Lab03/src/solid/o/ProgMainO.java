package solid.o;

public class ProgMainO {

    public static void main(String[] args) {
        /*Employee empMada = new Employee(1, "Mada", "FTE", 2000);
        System.out.println(empMada.toString() + " BONUS: " + empMada.calculateBonus());

        Employee empJohn = new Employee(2, "John", "Vendor", 1800);
        System.out.println(empJohn.toString() + " BONUS: " + empJohn.calculateBonus());*/

        Employee vendorEmployee = new VendorEmployee(1, "dvs", 1800);
        System.out.println(vendorEmployee + " BONUS: " + ((VendorEmployee) vendorEmployee).calculateBonus());

        Employee ftEmployee = new FTEmployee(2, "mada", 2000);
        System.out.println(ftEmployee + " BONUS: " + ((FTEmployee) ftEmployee).calculateBonus());
    }
}
