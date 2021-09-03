package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Query {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost/jdbc";//接続文字列
        String user = "jdbc";
        String password = "jdbc";
        String sql = "SELECT * FROM department WHERE dept_id = ?";

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

                // sql の 1番目に出現した「?」に「1」を代入する
                ps.setInt(1, 1);

                //SQL（SELECT）の実行と、結果セットの取得
                ResultSet rs = ps.executeQuery();

                // 結果セットから、カーソルがポイントする行の列の値を取り出して、
                // 画面に出力
                while (rs.next()) {
                    System.out.println("dept_id: " + rs.getInt("dept_id") + ",");
                    System.out.println("dept_name:" + rs.getString("dept_name"));
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("プログラム、実行成功");
    }
}
