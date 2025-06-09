package com.ecommerce.website.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ProductsEntity
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prod_id;
    private String name;
    private String Description;
    private float price;
    private Long stock_quantity;
    private String image_url;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private Long category_id;

    public Long getProd_id() {
        return prod_id;
    }

    public void setProd_id(Long prod_id) {
        this.prod_id = prod_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Long getStock_quantity() {
        return stock_quantity;
    }

    public void setStock_quantity(Long stock_quantity) {
        this.stock_quantity = stock_quantity;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }
}
