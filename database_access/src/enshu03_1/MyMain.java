package enshu03_1;

import config.AppConfig;

import java.sql.*;

public class MyMain {
    public static void main(String[] args) {
        // データベースへの接続
        try (Connection con = AppConfig.ConnectDatabase()) {
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
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
