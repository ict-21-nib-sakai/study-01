package enshu03_3;

import config.AppConfig;

import java.sql.*;

public class MyMain {
    public static void main(String[] args) {
        // JDBCドライバの読み込み
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // データベースへの接続
        try (Connection con = AppConfig.ConnectDatabase()) {
            final String sql =
                "SELECT " +
                    "  emp_id" +
                    ", emp_name" +
                    ", department.dept_name" +
                    ", registered_date" +
                    " FROM employee" +
                    " INNER JOIN department" +
                    " USING (dept_id)" +
                    " WHERE emp_id = ?";

            /** SQL 実行オブジェクト */
            PreparedStatement ps = con.prepareStatement(sql);

            // 「?」を置換
            ps.setInt(1, 1003);

            /** SQL (SELECT) の実行結果の結果セット */
            ResultSet rs = ps.executeQuery();

            // 結果セットから1行ずつ、1カラムずつ取得して画面に出力
            while (rs.next()) {
                System.out.printf(
                    "emp_id: %d | emp_name: %s | dept_name: %s | registered_date: %s" + "\n",
                    rs.getInt("emp_id"),
                    rs.getString("emp_name"),
                    rs.getString("dept_name"),
                    rs.getTimestamp("registered_date")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
