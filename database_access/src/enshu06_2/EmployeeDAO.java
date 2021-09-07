package enshu06_2;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO extends DAO {
    /**
     * 指定した主キーを持つ従業員を返す
     *
     * @param emp_id 従業員ID
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

        final PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, emp_id);

        final ResultSet rs = ps.executeQuery();

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
     * 1件から複数の従業員を登録する
     */
    public List<Employee> insert(List<Employee> employees) throws SQLException {
        final Connection con;

        label:
        try {
            con = EmployeeDAO.Connect();

            if (!con.isClosed()) {
                break label;
            }
        } catch (SQLException e) {
            // データベース接続失敗
            throw e;
        }

        final List<Employee> insertedEmployee = new ArrayList<>();

        try {
            // 自動コミットモードを無効にする。
            con.setAutoCommit(false);

            // SQL の実行準備をする。
            final PreparedStatement ps = con.prepareStatement(
                "INSERT INTO employee VALUES (?, ?, ?, ?)"
            );

            final LocalDateTime now = LocalDateTime.now();
            final java.sql.Timestamp time = java.sql.Timestamp.valueOf(now);

            // 引数に渡された複数の従業員を1件ずつ employee テーブルに追加する。
            for (Employee employee : employees) {
                ps.setInt(1, employee.getEmp_id());
                ps.setString(2, employee.getEmp_name());
                ps.setInt(3, employee.getDept_id());
                ps.setTimestamp(4, time);

                // INSERT を実行
                ps.executeUpdate();

                /** INSERT の結果、登録された従業員 */
                final Employee saved = this.findById(
                    employee.getEmp_id()
                );

                // 戻り値用のリスト変数にINSERTの結果を追加する
                insertedEmployee.add(saved);
            }

            // すべてうまく登録できたので、トランザクションをコミットする。
            con.commit();
        } catch (SQLException e) {
            // 1件でも失敗したらロールバックする。
            con.rollback();
            throw e;
        }

        return insertedEmployee;
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
