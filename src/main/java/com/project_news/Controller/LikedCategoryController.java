package com.project_news.Controller;

import com.project_news.Entity.LikedCategory;
import com.project_news.Entity.LikedCategory;
import com.project_news.Service.LikedCategoryServices.LikedCategoryService;
import com.project_news.Service.LikedServices.LikedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class LikedCategoryController {
    @Autowired
    private LikedCategoryService likedCategoryService;

    //    ADD LIKES
    @PostMapping("/addLikedCategory")
    public LikedCategory addLikedCate(@RequestBody LikedCategory likedCategory) {
        return likedCategoryService.addLikedCate(likedCategory);
    }

    //    FETCH LIKES FROM DB
    @GetMapping("/getLikedCategory")
    public ArrayList<LikedCategory> getLike() {
        return likedCategoryService.getLikedCate();
    }

//    FETCH LIKES BY ID FROM DB

    @GetMapping("/getLikedCategory/{id}")
    public LikedCategory getLikeById(@PathVariable("id") Long likedCateId) {
        return likedCategoryService.getLikedCateById(likedCateId);
    }

    //    DELETE LIKES BY ID
    @DeleteMapping("/deleteLikedCategory/{id}")
    public String deleteLikeById(@PathVariable("id") Long likedCateId) {
        likedCategoryService.deleteLikedCateById(likedCateId);
        return "Liked Category Removed Successfully";
    }

}
