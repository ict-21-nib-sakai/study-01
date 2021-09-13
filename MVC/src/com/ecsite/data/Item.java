package com.ecsite.data;

/**
 * 商品クラス
 */
public class Item {
    private int itemId;
    private String name;
    private String manufacturer;
    private int categoryId;
    private String color;
    private int price;
    private int stock;
    private boolean recommended;

    public int getItemId() {
        return itemId;
    }

    public Item setItemId(int itemId) {
        this.itemId = itemId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Item setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public Item setCategoryId(int categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Item setColor(String color) {
        this.color = color;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Item setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getStock() {
        return stock;
    }

    public Item setStock(int stock) {
        this.stock = stock;
        return this;
    }

    public boolean isRecommended() {
        return recommended;
    }

    public Item setRecommended(boolean recommended) {
        this.recommended = recommended;
        return this;
    }
}
