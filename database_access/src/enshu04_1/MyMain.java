package enshu04_1;

import java.sql.*;
import java.time.LocalDateTime;

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
            final String sql =
                "INSERT INTO employee (" +
                    "  emp_id" +
                    ", emp_name" +
                    ", dept_id" +
                    ", registered_date" +
                    ") " +
                    "VALUES (?, ?, ?, ?)";

            /** SQL 実行オブジェクト */
            PreparedStatement ps = con.prepareStatement(sql);

            LocalDateTime now = LocalDateTime.now();
            java.sql.Timestamp time = java.sql.Timestamp.valueOf(now);

            // 「?」を置換
            ps.setInt(1, 1006);
            ps.setString(2, "Taro YAMADA");
            ps.setInt(3, 4);
            ps.setTimestamp(4, time);

            /** SQL (INSERT) の実行結果 */
            int rs = ps.executeUpdate();

            if (1 == rs) {
                System.out.println("レコードの登録が完了しました。");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
