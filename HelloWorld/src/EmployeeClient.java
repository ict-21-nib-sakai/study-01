public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // John Doe を入社
        employee.setName("John Doe");
        employee.enter();

        // John Doe を退職
        employee.leave();

        Employee employee2 = new Employee();

        // Jane Doe を入社
        employee2.setName("Jane Doe");
        employee2.enter();

        // Jane Doe を退職
        employee2.leave();
    }
}