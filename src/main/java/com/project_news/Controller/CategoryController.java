package com.project_news.Controller;

import com.project_news.Entity.Category;
import com.project_news.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    //    ADD CATEGORIES IN DB
    @PostMapping("/addCategory")
    public Category addCategory(@RequestBody Category category){

        return categoryService.addCategory(category);
    }

    //    FETCH DATA FROM DB
    @GetMapping("/getCategory")
    public ArrayList<Category> getCategory(){
        return categoryService.getCategory();
    }
}
