package com.project_news.Controller;

import com.project_news.Entity.Liked;
import com.project_news.Service.LikedServices.LikedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class LikedController {

    @Autowired
    private LikedService likedService;


    //    ADD LIKES
    @PostMapping("/addLikes")
    public Liked addLike(@RequestBody Liked liked) {
        return likedService.addLike(liked);
    }

    //    FETCH LIKES FROM DB
    @GetMapping("/getLikes")
    public ArrayList<Liked> getLike() {
        return likedService.getLike();
    }

//    FETCH LIKES BY ID FROM DB

    @GetMapping("/getLikes/{id}")
    public Liked getLikeById(@PathVariable("id") Long likedId) {
        return likedService.getLikeById(likedId);
    }

    //    DELETE LIKES BY ID
    @DeleteMapping("/deleteLikes/{id}")
    public String deleteLikeById(@PathVariable("id") Long likedId) {
        likedService.deleteLikesById(likedId);
        return "Like Removed Successfully";
    }

}
