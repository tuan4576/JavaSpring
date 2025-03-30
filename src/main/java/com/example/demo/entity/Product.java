package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, length=50)
    private String name;

    private String image;
    private double price;
    private String description;
    private Integer stockQuantity;
    private Long sold;
    private String target;
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "user_id",nullable=false)
    private User userId;
}