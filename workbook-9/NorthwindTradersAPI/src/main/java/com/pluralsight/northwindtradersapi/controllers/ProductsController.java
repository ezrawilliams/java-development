package com.pluralsight.northwindtradersapi.controllers;

import com.pluralsight.northwindtradersapi.models.Category;
import com.pluralsight.northwindtradersapi.models.Product;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductsController {
    List<Product> products = new ArrayList<>();

    @RequestMapping(path="/products", method = RequestMethod.GET)
    public List<Product> getProducts(){
        products.add(new Product(1,1,"Rice", 2.99));
        products.add(new Product(2,1,"Lentils", 2.99));
        products.add(new Product(3,1,"Soup", 2.99));
        return products;
    }

    @RequestMapping(path="/products/{productId}",method=RequestMethod.GET)
    public Product getProduct(@PathVariable int productId){
        for(Product product: products){
            if(product.getProductId()==productId){
                return product;
            }
        }
        return null;
    }

    @RequestMapping(value = "path=/products/{categoryId}", method = RequestMethod.GET)
    public List<Product> getProductsPerCategory(@RequestParam() int categoryId){
        List<Product> productCat = new ArrayList<>();
        for (Product product: products){
            if (product.getCategoryId()==categoryId){
                productCat.add(product);
            }
        }
        return productCat;
    }

}
