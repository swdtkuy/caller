package com.example.caller.model;

public class Product {
    private String productName;
    private String productSpecification;
    private String productId;

    public Product(String productName, String productSpecification, String productId) {
        this.productName = productName;
        this.productSpecification = productSpecification;
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSpecification() {
        return productSpecification;
    }

    public void setProductSpecification(String productSpecification) {
        this.productSpecification = productSpecification;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        if (productSpecification != null ? !productSpecification.equals(product.productSpecification) : product.productSpecification != null) return false;
        return productId != null ? productId.equals(product.productId) : product.productId == null;
    }

    @Override
    public int hashCode() {
        int result = productName != null ? productName.hashCode() : 0;
        result = 31 * result + (productSpecification != null ? productSpecification.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productSpecification='" + productSpecification + '\'' +
                ", productId='" + productId + '\'' +
                '}';
    }
}