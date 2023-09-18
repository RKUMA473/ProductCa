package com.CaseStudy.ProductCatalogue.Controller;


import com.CaseStudy.ProductCatalogue.Entity.ProductEntity;
import com.CaseStudy.ProductCatalogue.Repository.ProductRepo;
import com.CaseStudy.ProductCatalogue.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/product")
public class ProductController {

    @Autowired
    private ProductService productService;

//    @PostMapping()
//    public ResponseEntity<ProductRepo> saveBook(@RequestBody ProductRepo book) {
//        return new ResponseEntity<ProductRepo>(productService.saveProduct(book), HttpStatus.CREATED);
//    }
//
//    public ProductRepo createProduct(@RequestBody ProductRepo productRepo){
//        return productService.createProduct((productRepo));
//    }
//
//    @PutMapping("/{id}")
//    public ProductRepo updateProduct(@PathVariable int id, @RequestBody ProductRepo product) {
//        return productService.updateProduct(id,product);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteProduct(@PathVariable int id) {
//        productService.deleteProduct(id);
//    }
//
//    @GetMapping("/{id}")
//     public ProductRepo getProductById(@PathVariable Long id) {
//         return productService.getProductById(id);
//    }
//
//    @GetMapping
//    public List<ProductRepo> getAllProducts() {
//        return productService.getAllProducts();
//    }


    @RequestMapping(value="/hello")
    public String sayHello(){
        return "Hello SpringBoot Project";
    }

    @PostMapping("/addProduct")
    public ResponseEntity<ProductEntity> saveProduct(@RequestBody ProductEntity productEntity) {
        return new ResponseEntity<ProductEntity>(productService.saveProduct(productEntity), HttpStatus.CREATED);
    }

    @GetMapping("/allProduct")
    public ResponseEntity<List<ProductEntity>> getAllProducts() {
        return new ResponseEntity<List<ProductEntity>>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductEntity> getProductById(@PathVariable("id") Integer productId) {
        return new ResponseEntity<ProductEntity>(productService.getProductById(productId), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductEntity> updateBook(@PathVariable("id") Integer productId, @RequestBody ProductEntity productEntity) {
        return new ResponseEntity<ProductEntity>(productService.updateProduct(productEntity, productId), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Integer productId) {
        productService.deleteProduct(productId);

        return new ResponseEntity<String>("Product " + productId + " deleted successfully", HttpStatus.OK);
    }
}
