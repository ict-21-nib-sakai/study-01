package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Query {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        String url = "jdbc:postgresql://localhost/jdbc";//接続文字列
        String user = "jdbc";
        String password = "jdbc";
        String sql = "SELECT * FROM department";

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO 自動生成された catch ブロック
            e1.printStackTrace();
        }

        //DBへの接続
        try (Connection con = DriverManager.getConnection(url, user, password)) {
            //SQL実行オブジェクトの取得
            try (PreparedStatement ps = con.prepareStatement(sql)) {

                //SQL（SELECT）の実行と、結果セットの取得
                ResultSet rs = ps.executeQuery();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("プログラム、実行成功");
    }

}