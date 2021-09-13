package com.ecsite.service;

import com.ecsite.dao.ItemDAO;
import com.ecsite.data.Item;

import java.util.List;

public class ItemService {
    public List<Item> findAll() {
        ItemDAO dao = new ItemDAO();
        return dao.findAll();
    }
}
