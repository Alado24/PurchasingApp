package org.ulpgc.is1.model;

public class Product {
    private final int id;
    private String name;
    private String description;
    private int price;
    private ProductCategory category;
    private Discount discount;

    public Product(int id, String name, String description, int price, ProductCategory category, String dateFrom, String dateTo, int percentage) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.discount = new Discount(dateFrom, dateTo, percentage);
    }

    public Product(int id, String name, String description, int price, ProductCategory category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.discount = null;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(String dateFrom, String dateTo, int percentage) {
        this.discount = new Discount(dateFrom, dateTo, percentage);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Product otherProduct = (Product) obj;
        return id == otherProduct.id;
    }
}
