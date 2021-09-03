package enshu06_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
  private static final String URL = "jdbc:mysql://localhost/jdbc";
  private static final String USER = "jdbc";
  private static final String PASSWORD = "jdbc";

  public Employee findById(int empId) throws SQLException {
    // 結果情報の定義
    Employee emp = null;
    String sql = "SELECT "
        + " e.emp_id, e.emp_name, e.dept_id, d.dept_name, e.registered_date"
        + " FROM employee e"
        + " INNER JOIN department d"
        + " ON e.dept_id=d.dept_id"
        + " WHERE e.emp_id=?";

    // 接続
    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
      // ステートメントの定義
      try (PreparedStatement ps = conn.prepareStatement(sql)) {
        // プレースホルダに設定
        ps.setInt(1, empId);

        // 結果の取得
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
          emp = new Employee();
          Department dept = new Department();

          // 従業員情報の設定
          emp.setEmpId(rs.getInt("emp_id"));
          emp.setEmpName(rs.getString("emp_name"));
          emp.setDeptId(rs.getInt("dept_id"));
          emp.setRegisteredDate(rs.getTimestamp("registered_date").toLocalDateTime());
          // 部署情報の設定
          dept.setDeptId(rs.getInt("dept_id"));
          dept.setDeptName(rs.getString("dept_name"));
          // 部署情報を従業員情報に設定
          emp.setDepartment(dept);
        }
      } catch (SQLException e) {
        throw e;
      }

    } catch (SQLException e) {
      throw e;
    }
    return emp;
  }

  public List<Employee> findAll() throws SQLException {
    // 結果リストの定義
    List<Employee> list = new ArrayList<>();

    String sql = "SELECT "
        + " e.emp_id, e.emp_name, e.dept_id, d.dept_name, e.registered_date"
        + " FROM employee e"
        + " INNER JOIN department d"
        + " ON e.dept_id=d.dept_id";
    // 接続
    try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
      // ステートメントの定義
      try (PreparedStatement ps = conn.prepareStatement(sql)) {

        // 結果の取得
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
          Employee emp = new Employee();
          Department dept = new Department();

          // 従業員情報の設定
          emp.setEmpId(rs.getInt("emp_id"));
          emp.setEmpName(rs.getString("emp_name"));
          emp.setDeptId(rs.getInt("dept_id"));
          emp.setRegisteredDate(rs.getTimestamp("registered_date").toLocalDateTime());
          // 部署情報の設定
          dept.setDeptId(rs.getInt("dept_id"));
          dept.setDeptName(rs.getString("dept_name"));
          // 部署情報を従業員情報に設定
          emp.setDepartment(dept);

          // 結果リストに追加
          list.add(emp);
        }

      } catch (SQLException e) {
        throw e;
      }

    } catch (SQLException e) {
      throw e;
    }
    return list;
  }
}