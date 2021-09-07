package enshu06_2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * データベースアクセス 演習問題
 * 演習 6.2 DAO パターンを意識したクラス定義
 */
public class Client {
    public static void main(String[] args) {
        final EmployeeDAO dao = new EmployeeDAO();

        //<editor-fold desc="findById の実行確認">
        label: try {
            Employee employee = dao.findById(1002);

            if (null == employee) {
                break label;
            }

            System.out.println("emp_id: " + employee.getEmp_id());
            System.out.println("emp_name: " + employee.getEmp_name());
            System.out.println("dept_id: " + employee.getDept_id());
            System.out.println("dept_name: " + employee.getDepartment().getDept_name());
            System.out.println("registered_date: " + employee.getRegistered_date());

        } catch (SQLException e) {
            e.printStackTrace();
        }
        //</editor-fold>

        //<editor-fold desc="findAll の実行確認">
        try {
            List<Employee> employees = dao.findAll();
            for (Employee employee : employees) {
                System.out.println("emp_id: " + employee.getEmp_id());
                System.out.println("emp_name: " + employee.getEmp_name());
                System.out.println("dept_id: " + employee.getDept_id());
                System.out.println("dept_name: " + employee.getDepartment().getDept_name());
                System.out.println("registered_date: " + employee.getRegistered_date());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //</editor-fold>

        //<editor-fold desc="insert の実行確認">
        final List<Employee> employees = new ArrayList<>();

        // 従業員1人目
        final Employee employee1 = new Employee();
        employee1
            .setEmp_id(3001)
            .setEmp_name("Taro YAMADA")
            .setDept_id(1)
        ;
        employees.add(employee1);

        // 従業員2人目
        final Employee employee2 = new Employee();
        employee2
            .setEmp_id(3002)
            .setEmp_name("Hanako TANAKA")
            .setDept_id(2)
        ;
        employees.add(employee2);

        // 複数の従業員を登録
        try {
            /** 登録された従業員 */
            List<Employee> insertedEmployees = dao.insert(employees);

            for (Employee insertedEmployee : insertedEmployees) {
                System.out.println("emp_id: " + insertedEmployee.getEmp_id());
                System.out.println("emp_name: " + insertedEmployee.getEmp_name());
                System.out.println("dept_id: " + insertedEmployee.getDept_id());
                System.out.println("dept_name: " + insertedEmployee.getDepartment().getDept_name());
                System.out.println("registered_date: " + insertedEmployee.getRegistered_date());
                System.out.println("-------------------------");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //</editor-fold>
    }
}
