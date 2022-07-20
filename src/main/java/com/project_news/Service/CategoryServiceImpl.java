package com.project_news.Service;

import com.project_news.Entity.Category;
import com.project_news.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Objects;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return categoryRepository.save(category);
    }


    @Override
    public ArrayList<Category> getCategory() {
        return (ArrayList<Category>) categoryRepository.findAll();
    }


    @Override
    public Category getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

    @Override
    public void deleteCategory(Long categoryId) {
        categoryRepository.deleteById(categoryId);
    }

    @Override
    public Category updateCategory(Long categoryId, Category category) {
        Category editCategory = categoryRepository.findById(categoryId).get();

        if(Objects.nonNull(category.getCategoryName()) && !" ".equalsIgnoreCase(category.getCategoryName())){
            editCategory.setCategoryName(category.getCategoryName());
        }
        return categoryRepository.save(editCategory);
    }
}
