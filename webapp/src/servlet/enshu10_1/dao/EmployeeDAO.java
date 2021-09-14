package servlet.enshu10_1.dao;

import servlet.enshu10_1.data.Department;
import servlet.enshu10_1.data.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    /**
     * データーベースへの接続
     */
    private Connection init() throws ClassNotFoundException, SQLException {
        // データベースへの接続文字列
        final String URL = "jdbc:postgresql://localhost:15432/jdbc";

        // データベースに接続するユーザー名
        final String USER = "postgres";

        // データベースに接続するユーザーのパスワード
        final String PASSWORD = "postgres";

        // データベース接続のためのクラスロード
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public List<Employee> findAll() throws ClassNotFoundException, SQLException {
        // データベースに接続
        final Connection connection = init();

        // 従業員 (部署名付き) を全件取得する
        final String sql =
            "SELECT" +
            "   employee.*" +
            " , department.dept_name" +
            " FROM employee" +
            " INNER JOIN department" +
            " ON department.dept_id = employee.dept_id";

        final PreparedStatement statement = connection.prepareStatement(sql);
        final ResultSet resultSet = statement.executeQuery();

        // 従業員 (部署名付き) を1件ずつListに追加する
        final List<Employee> employees = new ArrayList<>();
        while (resultSet.next()) {
            final Employee employee = new Employee();
            employee
                .setEmpId(resultSet.getInt("emp_id"))
                .setName(resultSet.getString("emp_name"))
                .setDeptId(resultSet.getInt("dept_id"))
                .setRegisteredDate(resultSet.getTimestamp("registered_date"));

            final Department department = new Department();
            department
                .setDeptId(resultSet.getInt("dept_id"))
                .setDeptName(resultSet.getString("dept_name"));

            employee.setDepartment(department);

            employees.add(employee);
        }

        statement.close();
        connection.close();

        return employees;
    }
}
