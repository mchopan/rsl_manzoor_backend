package com.project_news.Service;

import com.project_news.Entity.Category;
import com.project_news.Entity.Location;

import java.util.ArrayList;

public interface CategoryService {
    ArrayList<Category> getCategory();

    Category addCategory(Category category);

    Category getCategoryById(Long categoryId);

    void deleteCategory(Long categoryId);

    Category updateCategory(Long categoryId, Category category);
}
