package dao;

public class EmployeeClient {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();

        for (Employee employee : dao.findAll()) {
            System.out.println("emp_id: " + employee.getEmp_id());
            System.out.println("emp_name: " + employee.getEmp_name());
            System.out.println("dept_id: " + employee.getDept_id());
            System.out.println("dept_name: " + employee.getDepartment().getDept_name());
            System.out.println("registered_date: " + employee.getRegistered_date());
        }
    }
}
