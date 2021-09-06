package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    private static final String DB_HOST = "localhost";
    private static final int DB_PORT = 15432;
    private static final String DB_USER = "jdbc";
    private static final String DB_PASSWORD = "jdbc";

    /**
     * 従業員情報を全件持ってくる。部署情報も含めて。
     */
    public List<Employee> findAll() {
        final String sql =
            "SELECT\n" +
                "  employee.emp_id\n" +
                ", employee.emp_name\n" +
                ", employee.dept_id\n" +
                ", employee.registered_date\n" +
                ", department.dept_name\n" +
                "FROM employee\n" +
                "INNER JOIN department\n" +
                "ON department.dept_id = employee.dept_id";

        List<Employee> list = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(
            EmployeeDAO.JdbcUrl(),
            DB_USER,
            DB_PASSWORD
        )) {
            try (PreparedStatement ps = con.prepareStatement(sql);) {
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    // 従業員の情報を代入
                    Employee employee = new Employee();
                    employee
                        .setEmp_id(rs.getInt("emp_id"))
                        .setEmp_name(rs.getString("emp_name"))
                        .setDept_id(rs.getInt("dept_id"))
                        .setRegistered_date(rs.getTimestamp("registered_date"))
                    ;

                    // 関連先の department を追加
                    Department department = new Department();
                    department
                        .setDept_id(rs.getInt("dept_id"))
                        .setDept_name(rs.getString("dept_name"))
                    ;

                    // 従業員に紐づく部署を代入
                    employee.setDepartment(department);

                    list.add(employee);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    /**
     * @return データベース接続文字列
     */
    private static String JdbcUrl() {
        return String.format(
            "jdbc:postgresql://%s:%d/jdbc",
            DB_HOST,
            DB_PORT
        );
    }
}
