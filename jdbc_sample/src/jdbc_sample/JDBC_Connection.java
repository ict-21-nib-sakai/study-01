package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connection {

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/jdbc";
        String user = "jdbc";
        String password = "jdbc";
        String sql = "SELECT * FROM department";

        Connection con = null;

        try {
            // DB への接続
            con = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        } finally {
            // DBへの接続解放 (最初の try に書くと良くない。)
            try {
                con.close();
            } catch (SQLException e) {
                // TODO 自動生成された catch ブロック
                e.printStackTrace();
            }
        }
    }

}
