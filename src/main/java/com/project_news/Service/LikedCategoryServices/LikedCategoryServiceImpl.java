package com.project_news.Service.LikedCategoryServices;

import com.project_news.Entity.LikedCategory;
import com.project_news.Repository.LikedCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class LikedCategoryServiceImpl implements LikedCategoryService{

    @Autowired
    private LikedCategoryRepository likedCategoryRepository;

    @Override
    public void deleteLikedCateById(Long likedCateId) {
        likedCategoryRepository.deleteById(likedCateId);
    }

    @Override
    public LikedCategory getLikedCateById(Long likedCateId) {
        return likedCategoryRepository.findById(likedCateId).get();
    }

    @Override
    public ArrayList<LikedCategory> getLikedCate() {
        return (ArrayList<LikedCategory>) likedCategoryRepository.findAll();
    }

    @Override
    public LikedCategory addLikedCate(LikedCategory likedCategory) {
        return likedCategoryRepository.save(likedCategory);
    }
}
