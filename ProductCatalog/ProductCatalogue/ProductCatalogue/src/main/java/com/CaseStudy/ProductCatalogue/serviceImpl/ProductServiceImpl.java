package com.CaseStudy.ProductCatalogue.serviceImpl;

import com.CaseStudy.ProductCatalogue.Entity.ProductEntity;
import com.CaseStudy.ProductCatalogue.Repository.ProductRepo;
import com.CaseStudy.ProductCatalogue.Service.ProductService;
import com.CaseStudy.ProductCatalogue.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;


    @Override
    public ProductEntity saveProduct(ProductEntity productEntity){
//        String randomProductId= UUID.randomUUID().toString();
//        productEntity.setId(randomProductId);
        return productRepo.save(productEntity);
    }

    @Override
    public List<ProductEntity> getAllProducts(){
        return productRepo.findAll();
    }

    @Override
    public ProductEntity getProductById(Integer productId){
        return productRepo.findById(productId).orElseThrow(
                ()-> new ResourceNotFoundException("Book with given id is not found on server!!!" + productId));
    }

    @Override
    public ProductEntity updateProduct(ProductEntity productEntity, Integer productId){
        ProductEntity existingProduct= productRepo.findById(productId).orElseThrow(
                ()-> new ResourceNotFoundException("Book with given id is not found on server!!!" + productId));
        existingProduct.setId(productEntity.getId());
        existingProduct.setName(productEntity.getName());
        existingProduct.setPrice((productEntity.getPrice()));
        existingProduct.setDescription(productEntity.getDescription());
        existingProduct.setAvailability(productEntity.isAvailability());

        return existingProduct;
    }


    @Override
    public void deleteProduct(Integer productId){
        productRepo.findById(productId)
                .orElseThrow(()-> new ResourceNotFoundException("Book " + productId + "deleted successfully"));
        productRepo.deleteById(productId);
    }
}
