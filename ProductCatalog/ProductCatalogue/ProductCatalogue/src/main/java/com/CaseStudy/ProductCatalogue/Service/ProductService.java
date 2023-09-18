package com.CaseStudy.ProductCatalogue.Service;

import com.CaseStudy.ProductCatalogue.Entity.ProductEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    ProductEntity saveProduct(ProductEntity productEntity);

    List<ProductEntity> getAllProducts();

    ProductEntity getProductById(Integer productId);

    ProductEntity updateProduct(ProductEntity productEntity, Integer productId);

    void deleteProduct(Integer productId);
}
