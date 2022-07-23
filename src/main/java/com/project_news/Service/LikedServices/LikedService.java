package com.project_news.Service.LikedServices;

import com.project_news.Entity.Liked;

import java.util.ArrayList;

public interface LikedService {
    Liked addLike(Liked liked);

    ArrayList<Liked> getLike();

    Liked getLikeById(Long likedId);

    void deleteLikesById(Long likedId);

}
