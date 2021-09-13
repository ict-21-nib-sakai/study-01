package com.ecsite.dao;

import com.ecsite.data.User;

import java.sql.*;

public class UserDAO extends CommonDAO {
    public User selectByUserId(String userId) {
        User user = null;

        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD)) {
            final String sql =
                "SELECT *" +
                    " FROM users" +
                    " WHERE user_id = ?" +
                    " ;";

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, userId);
                ResultSet rs = ps.executeQuery();

                if (!rs.next()) {
                    rs.close();
                    con.close();
                    return null;
                }

                user = new User();
                user
                    .setUserid(rs.getString("user_id"))
                    .setName(rs.getString("name"))
                    .setPassword(rs.getString("password"))
                    .setAddress(rs.getString("address"))
                ;

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }
}
