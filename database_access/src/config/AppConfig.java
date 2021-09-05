package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppConfig {
    private static final String DB_HOST = "localhost";
    private static final int DB_PORT = 15432;
    private static final String DB_USER = "jdbc";
    private static final String DB_PASSWORD = "jdbc";

    /** データベースへの接続情報 */
    private static Connection database_connection;

    /**
     * @return データベース接続文字列
     */
    public static String JdbcUrl() {
        return String.format(
            "jdbc:postgresql://%s:%d/jdbc",
            DB_HOST,
            DB_PORT
        );
    }

    /**
     * @return データベースへの接続情報
     */
    public static Connection ConnectDatabase() throws SQLException {
        // 接続済みの場合は、キャッシュしている値を返す
        if (AppConfig.database_connection != null) {
            return AppConfig.database_connection;
        }

        // データベースに接続して、接続情報をキャッシュする
        AppConfig.database_connection = DriverManager.getConnection(
            AppConfig.JdbcUrl(),
            AppConfig.DB_USER,
            AppConfig.DB_PASSWORD
        );

        return AppConfig.database_connection;
    }
}
