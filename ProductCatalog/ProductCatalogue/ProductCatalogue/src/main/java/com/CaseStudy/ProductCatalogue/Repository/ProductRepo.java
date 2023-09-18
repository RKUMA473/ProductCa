package com.CaseStudy.ProductCatalogue.Repository;

import com.CaseStudy.ProductCatalogue.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<ProductEntity,Integer> {
}
