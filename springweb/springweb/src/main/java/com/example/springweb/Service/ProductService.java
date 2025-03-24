package com.example.springweb.Service;

import com.example.springweb.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products =new ArrayList<>(Arrays.asList(new Product(101,"Bigname",23),new Product(102,"Smallname",24)));
    public List<Product> getProduct(){
        return products;
    }

    public Product getproductbyid(int prodid){
        return products.stream()
                .filter(p -> p.getProdid() == prodid)
                .findFirst().get();
    }

    public void addProduct(Product prod) {
        System.out.println(prod);
        products.add(prod);
    }
}
