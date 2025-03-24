package com.example.springweb.Controller;

import com.example.springweb.Model.Product;
import com.example.springweb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProduct();
    }

    @GetMapping("/products/{prodId}")
    public Product getProducts(@PathVariable int prodId){
        return service.getproductbyid(prodId);
    }

    @PostMapping("/products")
    public void addProducts(@RequestBody Product prod){
        System.out.println(prod);
        service.addProduct(prod);
    }
}
