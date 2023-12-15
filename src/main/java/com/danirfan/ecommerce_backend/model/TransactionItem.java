package com.danirfan.ecommerce_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "transaction_items")
public class TransactionItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "product_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Product product;
    @JoinColumn(name = "product_variation_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private ProductVariation productVariation;
    @JoinColumn(name = "transaction_id")
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Transaction transaction;
    private int qty;

    public TransactionItem(){

    }

    public TransactionItem(int id, Product product, ProductVariation productVariation, Transaction transaction, int qty){
        this.id = id;
        this.product = product;
        this.productVariation = productVariation;
        this.transaction = transaction;
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public ProductVariation getProductVariation() {
        return productVariation;
    }

    public void setProductVariation(ProductVariation productVariation) {
        this.productVariation = productVariation;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
