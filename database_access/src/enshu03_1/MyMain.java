package enshu03_1;

import java.sql.*;

public class MyMain {
    public static void main(String[] args) {
        // JDBCドライバの読み込み
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        final String url = "jdbc:postgresql://localhost/jdbc";
        final String user = "jdbc";
        final String password = "jdbc";

        // データベースへの接続
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            final String sql = "SELECT * FROM employee";

            /** SQL 実行オブジェクト */
            PreparedStatement ps = con.prepareStatement(sql);

            /** SQL (SELECT) の実行結果の結果セット */
            ResultSet rs = ps.executeQuery();

            // 結果セットから1行ずつ、1カラムずつ取得して画面に出力
            while (rs.next()) {
                System.out.printf(
                    "emp_id: %d | emp_name: %s | dept_id: %d | registered_date: %s" + "\n",
                    rs.getInt("emp_id"),
                    rs.getString("emp_name"),
                    rs.getInt("dept_id"),
                    rs.getTimestamp("registered_date")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
