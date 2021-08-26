public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee = new Employee();

        // John Doe を入社
        employee.name = "John Doe";
        employee.enter();

        // John Doe を退職
        employee.leave();
    }
}