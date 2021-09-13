package com.ecsite.dao;

import com.ecsite.data.Item;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDAO extends CommonDAO {
    public List<Item> findAll() {
        final List<Item> items = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
            final String sql = "SELECT * FROM items";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                ResultSet resultSet = statement.executeQuery();

                while (resultSet.next()) {
                    Item item = new Item();
                    item
                        .setItemId(resultSet.getInt("item_id"))
                        .setName(resultSet.getString("name"))
                        .setManufacturer(resultSet.getString("manufacturer"))
                        .setCategoryId(resultSet.getInt("category_id"))
                        .setColor(resultSet.getString("color"))
                        .setPrice(resultSet.getInt("price"))
                        .setStock(resultSet.getInt("stock"))
                        .setRecommended(resultSet.getBoolean("recommended"))
                    ;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return items;
    }
}
