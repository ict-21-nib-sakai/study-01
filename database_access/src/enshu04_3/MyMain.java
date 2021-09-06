package enshu04_3;

import config.AppConfig;

import java.sql.*;
import java.time.LocalDateTime;

/**
 * 演習 4.3 授業員情報の更新 (1件の更新)
 */
public class MyMain {
    public static void main(String[] args) {
        // データベースへの接続
        try (Connection con = AppConfig.ConnectDatabase()) {
            final String sql =
                "UPDATE employee" +
                    " SET " +
                    "  emp_name = ?" +
                    ", dept_id = ?" +
                    " WHERE emp_id = ?";

            /** SQL 実行オブジェクト */
            PreparedStatement ps = con.prepareStatement(sql);

            LocalDateTime now = LocalDateTime.now();
            Timestamp time = Timestamp.valueOf(now);

            // 「?」を置換
            ps.setString(1, "Taro URASHIMA");
            ps.setInt(2, 1);
            ps.setInt(3, 1001);

            int result = ps.executeUpdate();

            if (1 == result) {
                System.out.println("レコードの更新が完了しました。");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
