package com.project_news.Service;

import com.project_news.Entity.Category;

import java.util.ArrayList;

public interface CategoryService {
    ArrayList<Category> getCategory();

    Category addCategory(Category category);
}
