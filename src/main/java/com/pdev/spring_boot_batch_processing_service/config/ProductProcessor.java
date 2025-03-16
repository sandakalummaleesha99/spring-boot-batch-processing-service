package com.pdev.spring_boot_batch_processing_service.config;

import com.pdev.spring_boot_batch_processing_service.model.Product;
import org.springframework.batch.item.ItemProcessor;

public class ProductProcessor implements ItemProcessor<Product, Product> {

    @Override
    public Product process(Product product) throws Exception {
        product.setOfferApplied(Boolean.FALSE);
        return product;
    }
}
