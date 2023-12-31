package com.danirfan.ecommerce_backend.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @JoinColumn(name = "address_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Address address;
    @JoinColumn(name = "user_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;
    @Column(columnDefinition = "varchar(20) default 'pending'")
    private String status;
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;

    public Transaction(){

    }

    public Transaction(int id, Address address, User user, String status, Date createdAt){
        this.id = id;
        this.address = address;
        this.user = user;
        this.status = status;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
