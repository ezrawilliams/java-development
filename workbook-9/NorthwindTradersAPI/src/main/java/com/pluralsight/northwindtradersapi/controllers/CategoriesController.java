package com.pluralsight.northwindtradersapi.controllers;

import com.pluralsight.northwindtradersapi.models.Category;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoriesController {
    List<Category> categories = new ArrayList<>();

    @RequestMapping(path="/categories", method = RequestMethod.GET)
    public List<Category> getCategories(){
        categories.add(new Category(1, "Pantry"));
        categories.add(new Category(2, "Toilet"));
        return categories;
    }

    @RequestMapping(path="/categories/{categoryId}",method=RequestMethod.GET)
    public Category getCategory(@PathVariable int categoryId){
        for(Category category: categories){
            if(category.getCategoryId()==categoryId){
                return category;
            }
        }
        return null;
    }
}
