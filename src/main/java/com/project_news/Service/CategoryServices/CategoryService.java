package com.project_news.Service.CategoryServices;

import com.project_news.Entity.Category;

import java.util.ArrayList;

public interface CategoryService {
    ArrayList<Category> getCategory();

    Category addCategory(Category category);

    Category getCategoryById(Long categoryId);

    void deleteCategory(Long categoryId);

    Category updateCategory(Long categoryId, Category category);
}
