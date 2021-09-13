package com.ecsite.data;

/**
 * 商品クラス
 */
public class Item {
    private int itemId;
    private String name;
    private String manufacturer;
    private int category;
    private String String;
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

    public java.lang.String getName() {
        return name;
    }

    public Item setName(java.lang.String name) {
        this.name = name;
        return this;
    }

    public java.lang.String getManufacturer() {
        return manufacturer;
    }

    public Item setManufacturer(java.lang.String manufacturer) {
        this.manufacturer = manufacturer;
        return this;
    }

    public int getCategory() {
        return category;
    }

    public Item setCategory(int category) {
        this.category = category;
        return this;
    }

    public java.lang.String getString() {
        return String;
    }

    public Item setString(java.lang.String string) {
        String = string;
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
