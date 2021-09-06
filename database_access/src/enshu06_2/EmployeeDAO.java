package enshu06_2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO extends DAO {
    /**
     * 指定した主キーを持つ従業員を返す
     *
     * @param emp_id 授業員ID
     */
    public Employee findById(int emp_id) throws SQLException {
        Connection con = EmployeeDAO.Connect();

        final String sql =
            "SELECT *" +
            " FROM employee" +
            " INNER JOIN department" +
            " ON employee.dept_id = department.dept_id" +
            " WHERE emp_id = ? "
        ;

        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, emp_id);

        ResultSet rs = ps.executeQuery();

        if (!rs.next()) {
            return null;
        }

        return EmployeeDAO.makeEmployee(rs);
    }

    /**
     * 従業員を全件取得する
     */
    public List<Employee> findAll() throws SQLException {
        Connection con = EmployeeDAO.Connect();

        final String sql =
            "SELECT *" +
            " FROM employee" +
            " INNER JOIN department" +
            " ON employee.dept_id = department.dept_id";

        final PreparedStatement ps = con.prepareStatement(sql);
        final ResultSet rs = ps.executeQuery();
        final List<Employee> employees = new ArrayList<>();

        while (rs.next()) {
            Employee employee = EmployeeDAO.makeEmployee(rs);
            employees.add(employee);
        }

        return employees;
    }

    /**
     * 従業員テーブルの ResultSet から Employee オブジェクトを返す
     *
     * @param rs 従業員テーブルへ問い合わせ結果
     */
    private static Employee makeEmployee(ResultSet rs) throws SQLException {
        final Employee employee = new Employee();
        employee
            .setEmp_id(rs.getInt("emp_id"))
            .setEmp_name(rs.getString("emp_name"))
            .setDept_id(rs.getInt("dept_id"))
            .setRegistered_date(rs.getTimestamp("registered_date"))
        ;

        final Department department = new Department();
        department
            .setDept_id(rs.getInt("dept_id"))
            .setDept_name(rs.getString("dept_name"))
        ;

        employee.setDepartment(department);

        return employee;
    }
}
