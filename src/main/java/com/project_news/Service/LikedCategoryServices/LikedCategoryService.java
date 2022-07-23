package com.project_news.Service.LikedCategoryServices;

import com.project_news.Entity.LikedCategory;

import java.util.ArrayList;

public interface LikedCategoryService {
    void deleteLikedCateById(Long likedCateId);

    LikedCategory getLikedCateById(Long likedCateId);

    ArrayList<LikedCategory> getLikedCate();

    LikedCategory addLikedCate(LikedCategory likedCategory);
}
