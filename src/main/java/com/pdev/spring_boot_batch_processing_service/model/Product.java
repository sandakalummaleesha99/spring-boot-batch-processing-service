package com.pdev.spring_boot_batch_processing_service.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;

    private double price;

    @Column(name = "is_offer_applied")
    private boolean isOfferApplied;

    @Column(name = "discount_percentage")
    private double discountPercentage;

    @Column(name = "price_after_discount")
    private double priceAfterDiscount;
}
