package com.project_news.Controller;

import com.project_news.Entity.Category;
import com.project_news.Service.CategoryServices.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    //    FETCH DATA BY ID

    @GetMapping("/getCategory/{id}")
    public Category getCategoryById(@PathVariable("id") Long categoryId){
        return categoryService.getCategoryById(categoryId);
    }
    //     DELETE BY ID
    @DeleteMapping("/deleteCategory/{id}")
    public  String deleteCategoryById(@PathVariable("id") Long categoryId){
        categoryService.deleteCategory(categoryId);
        return "Category Deleted Successfully";
    }

    //UPDATE  CATEGORY BY ID
    @PutMapping("/updateCategory/{id}")
    public Category updateCategory(@PathVariable("id") Long categoryId,@RequestBody Category category){
        return categoryService.updateCategory(categoryId,category);
    }
}
