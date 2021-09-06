package enshu06_2;

import java.sql.SQLException;
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
    }
}
