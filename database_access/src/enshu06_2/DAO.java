package enshu06_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {
    private static final String DB_HOST = "localhost";
    private static final int DB_PORT = 15432;
    private static final String DB_USER = "jdbc";
    private static final String DB_PASSWORD = "jdbc";

    /**
     * 接続状態を保持しておく
     */
    private static Connection con;

    /**
     * データベースに接続する
     *
     * @return データベース接続オブジェクト
     */
    public static Connection Connect() throws SQLException {
        if (null != DAO.con && !DAO.con.isClosed()) {
            return DAO.con;
        }

        DAO.con = DriverManager.getConnection(
            DAO.JdbcUrl(),
            DB_USER,
            DB_PASSWORD
        );

        return DAO.con;
    }

    /**
     * @return データベース接続文字列
     */
    private static String JdbcUrl() {
        return String.format(
            "jdbc:postgresql://%s:%d/jdbc",
            DB_HOST,
            DB_PORT
        );
    }
}
