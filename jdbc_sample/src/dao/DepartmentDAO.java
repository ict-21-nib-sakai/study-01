package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
    private static final String DB_HOST = "localhost";
    private static final int DB_PORT = 15432;
    private static final String DB_USER = "jdbc";
    private static final String DB_PASSWORD = "jdbc";

    /**
     * @return department テーブルのレコードを全件取得し、オブジェクトとして返す
     * <p>
     * この名前の付け方は会社やプロジェクトのルールに依る。
     */
    public List<Department> findAll() {
        /* SQL実行結果 */
        List<Department> list = new ArrayList<>();

        try (Connection con = DriverManager.getConnection(
            DepartmentDAO.JdbcUrl(),
            DepartmentDAO.DB_USER,
            DepartmentDAO.DB_PASSWORD
        )) {
            String sql = "SELECT * FROM department";

            try (PreparedStatement ps = con.prepareStatement(sql);) {
                ResultSet rs = ps.executeQuery();

                while (rs.next()) {
                    Department dept = new Department();
                    dept.setDept_id(rs.getInt("dept_id"));
                    dept.setDept_name(rs.getString("dept_name"));
                    list.add(dept);
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
