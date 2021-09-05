package enshu04_2;

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

        /** 2名の従業員を登録する */
        Employee[] employees = {
            new Employee(2001, "Hanako SATO", 3),
            new Employee(2002, "Kakuei TANAKA", 4)
        };

        // データベースへの接続
        try (Connection con = AppConfig.ConnectDatabase()) {
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

            // 「?」を置換
            for (Employee employee : employees) {
                ps.setInt(1, employee.getEmp_id());
                ps.setString(2, employee.getEmp_name());
                ps.setInt(3, employee.getDept_id());
                ps.setTimestamp(4, employee.getRegistered_date());

                // SQL (INSERT) を実行
                ps.executeUpdate();
            }

            System.out.println("レコードの登録が完了しました。");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
