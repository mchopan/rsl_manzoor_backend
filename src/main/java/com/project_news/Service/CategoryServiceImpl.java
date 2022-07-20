package com.project_news.Service;

import com.project_news.Entity.Category;
import com.project_news.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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
}
