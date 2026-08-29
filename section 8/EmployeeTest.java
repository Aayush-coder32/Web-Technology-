public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(
            101,
            "John Doe",
            75000.00,
            "Software Engineer",
            "IT"
        );

        System.out.println(emp.displayInfo());

        emp.setSalary(80000.00);
        emp.setDesignation("Senior Software Engineer");

        System.out.println("\nUpdated Employee Information:");
        System.out.println(emp.displayInfo());
    }
}
